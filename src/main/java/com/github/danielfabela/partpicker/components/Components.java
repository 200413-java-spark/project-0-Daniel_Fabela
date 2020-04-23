package com.github.danielfabela.partpicker.components;
import com.github.danielfabela.partpicker.io.*;
import com.github.danielfabela.partpicker.menus.*;
import java.util.List;

public class Components {
    protected int userInput = 0;
    protected double subTotal = 0.0;
    protected double taxes = 0.0;
    protected double totalPrice = 0.0;
    
    public Components(){}

    // Instantiate the objects
    Menu mainMenu = new Menu();
    IO input = new IO();

    // Main loop to check the user input and display the corresponding menus
    public void Userchoices( int userInput){
        List<String> specs = input.readAll();
        while(userInput != 0){
            if(userInput == 1){
                for(String part: specs){
                System.out.println(part);
                }
                mainMenu.CPUMenu();
                userInput = input.MenuInput();
                if(userInput == 1){
                    subTotal = subTotal + 85;
                    System.out.println("Subtotal Price = $" + subTotal);
                }
            }
            /*else if(userInput == 2){
                component.Motherboard();
                mainMenu.motherboardMenu();
                userChoice = input.MenuInput();
                    if(userChoice == 1){
                    subTotal = subTotal + component.MotherBoard1_Price;
                    System.out.println("Total Price = $" + subTotal);
                    }
            }*/   
            mainMenu.MainMenu();
            userInput = input.MenuInput();
        }
    }
    
}