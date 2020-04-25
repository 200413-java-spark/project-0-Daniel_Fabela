package com.github.danielfabela.partpicker.io;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.github.danielfabela.partpicker.components.Components;

public class IO{
    static final File input = new File("PartsInventory.csv");

    public IO(){}

    public List<String> File_Read(){
        List<String> parts = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(input))){
            String line = br.readLine();
            while (line!= null) {
                // use comma as separator to separate the strings
                String[] partDetails = line.split(",");
                String id = partDetails[0];
                String Model = partDetails[1];
                String Price = partDetails[2];
                // add each string into the array list
                parts.add(id);
                parts.add(Model);
                parts.add(Price);
                // keep reading the next line until the end of file
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("input file not found");
        } catch (IOException e) {
            e.printStackTrace();
        } 
        return parts;
    }
    // Method to write the array list
    public void writeAll(List<String> parts){

    }
    // method to take input from the user
    public int MenuInput(){
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        return input;
    } 
}