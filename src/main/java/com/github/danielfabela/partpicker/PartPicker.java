package com.github.danielfabela.partpicker;

import com.github.danielfabela.partpicker.components.Components;
import com.github.danielfabela.partpicker.menus.Menu;
import com.github.danielfabela.partpicker.io.IO;

class PartPicker{
    public static void main(String[] args){

        // Instantiate the objects
        Components component = new Components();
        Menu mainMenu = new Menu();
        IO input = new IO();

        // Variable to hold the user input
        int userInput = 0;
        int userChoice = 0;
        // Variable to hold the subtotal of the build
        double subTotal = 0.0;

        // Call to display the main menu
        mainMenu.MainMenu();
        // Take the user input and store it in a variable
        userInput = input.MenuInput();
        
        // Main loop to check the user input and display the corresponding menus
        while(userInput != 0){
            if(userInput == 1){
                component.CPU();
                mainMenu.CPUMenu();
                userChoice = input.MenuInput();
                if(userChoice == 1){
                    subTotal = subTotal + component.CPU1_Price;
                    System.out.println("Subtotal Price = $" + subTotal);
                }
            }
            else if(userInput == 2){
                component.Motherboard();
                mainMenu.motherboardMenu();
                userChoice = input.MenuInput();
                    if(userChoice == 1){
                    subTotal = subTotal + component.MotherBoard1_Price;
                    System.out.println("Total Price = $" + subTotal);
                    }
            }   
            mainMenu.MainMenu();
            userInput = input.MenuInput();
        }
    }
}            
