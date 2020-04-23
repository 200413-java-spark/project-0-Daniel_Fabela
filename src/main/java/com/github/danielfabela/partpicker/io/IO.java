package com.github.danielfabela.partpicker.io;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class IO implements Dao<String>{
    static final File Cpu = new File("Processors.csv");
    static final File Motherboard = new File("Motherboards.csv");
    static final File Gpu = new File("GPU.csv");
    BufferedReader br = null;

    private List<String> File_Read(){
        List<String> parts = new ArrayList<String>();
        try {
            br = new BufferedReader(new FileReader(Cpu));
            String line = br.readLine();
            while (line!= null) {
                // use comma as separator
                String[] Parts = line.split(",");
                parts.add(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return parts;
    }

    public int MenuInput(){
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        return input;
    }

    @Override
    public List<String> readAll(){
        return File_Read();
    }
}