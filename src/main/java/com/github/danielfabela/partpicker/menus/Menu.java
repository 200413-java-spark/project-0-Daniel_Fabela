package com.github.danielfabela.partpicker.menus;

public class Menu{
    // Default constructor
    public Menu(){}

    // Method to display the main Menu
    public void MainMenu(){
        System.out.println("*************************************************************");
        System.out.println("Welcome to PC Center");
        System.out.println("*************************************************************");
        System.out.println("Main Menu");
        System.out.println("0. Quit");
        System.out.println("1. See Components");
        System.out.println("2. Choose Components");
        System.out.println("3. Total Price");
        System.out.println("*************************************************************");
        System.out.println("Input your choice. Only numbers from 0 to 3.");
    }

    public void ComponentsMenu(){
        System.out.println("*************************************************************");
            System.out.println("Stock Inventory");
           
    }

    public void ChooseMenu(){
        System.out.println("*************************************************************");
        System.out.println("Input the Id's of the products you want to purchase");
    }
}