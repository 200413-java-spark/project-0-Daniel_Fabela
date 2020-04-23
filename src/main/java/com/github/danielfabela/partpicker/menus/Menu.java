package com.github.danielfabela.partpicker.menus;

public class Menu{
    // Default constructor
    public Menu(){}

    // Method to display the main Menu
    public void MainMenu(){
        System.out.println("Welcome to Part Picker");
        System.out.println("*************************************");
        System.out.println("Main Menu");
        System.out.println("Choose your parts wisely");
        System.out.println("0. Quit");
        System.out.println("1. CPU");
        System.out.println("2. MotherBoard");
        System.out.println("3. GPU");
        System.out.println("4. RAM");
        System.out.println("5. SSD");
        System.out.println("6. Power Supply");
        System.out.println("7. Case");
        System.out.println("*************************************");
        System.out.println("Input your choice. Only numbers from 0 to 7.");
    }

    public void CPUMenu(){
        System.out.println("*************************************");
            System.out.println("Choose your CPU");
            System.out.println("1. Model 1");
            System.out.println("2. Model 2");
            System.out.println("*************************************");
            System.out.println("Input your choice. Only numbers from 0 to 2.");
    }

    public void motherboardMenu(){
        System.out.println("*************************************");
            System.out.println("Choose your MotherBoard");
            System.out.println("1. Model 1");
            System.out.println("2. Model 2");
            System.out.println("*************************************");
            System.out.println("Input your choice. Only numbers from 0 to 2.");
    }
}