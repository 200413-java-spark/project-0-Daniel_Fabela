package com.github.danielfabela.partpicker.menus;
import com.github.danielfabela.partpicker.io.IO;

public class Menu{
    // Instantiate a new io object
    IO scanner = new IO();
    // declare an int variable to store the input chosen by the user
    int input = 0;

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
        System.out.println("6. HDD");
        System.out.println("7. Power Supply");
        System.out.println("8. Case");
        System.out.println("*************************************");
    }

    public void CPUMenu(){
        System.out.println("*************************************");
            System.out.println("Choose your CPU");
            System.out.println("1. Model 1");
            System.out.println("2. Model 2");
            System.out.println("*************************************");
            input = scanner.ComponentInput();
    }

    public void motherboardMenu(){
        System.out.println("*************************************");
            System.out.println("Choose your MotherBoard");
            System.out.println("1. Model 1");
            System.out.println("2. Model 2");
            System.out.println("*************************************");
            input = scanner.ComponentInput();
    }
}