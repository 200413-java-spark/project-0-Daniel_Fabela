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
import com.github.danielfabela.partpicker.components.ComponentsFactory;

public class IO implements Dao<Components>{
    //static final File input = new File("PartsInventory.csv");
    private File input;
    // Default constructor
    public IO(){}
    // Constructor to take a file
    public IO(File input){
        this.input = input;
    }

    @Override
    public List<Components> File_Read(){
        List<Components> parts = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(input))){
            ComponentsFactory factory = ComponentsFactory.getInstance();
            String line = br.readLine();
            while (line!= null) {
                // use comma as separator to separate the strings
                String[] partDetails = line.split(",");
                String Part = partDetails[0];
                String Model = partDetails[1];
                String sPrice = partDetails[2];
                // add each string into the array list
                parts.add(factory.getComponents(Part, Model, sPrice));
                // keep reading the next line until the end of file
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("Input File not Found");
        } catch (IOException e) {
            e.printStackTrace();
        } 
        return parts;
    }

    @Override
    // Method to write the array list
    public void writeAll(List<Components> parts){
    }

    // method to take input from the user
    public int MenuInput(){
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        return input;
    }
    
    public String fileInput(){
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        return input;
    }
}