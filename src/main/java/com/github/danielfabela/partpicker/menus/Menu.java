package com.github.danielfabela.partpicker.menus;

public class Menu{
    // Default constructor
    public Menu(){}

    // Method to display the main Menu
    public void MainMenu(){
        System.out.println("*************************************************************");
        System.out.println("Welcome to PC Budget");
        System.out.println("*************************************************************");
        System.out.println("Main Menu");
        System.out.println("0. Quit");
        System.out.println("1. See Listed Components");
        System.out.println("2. Calculate Total Price of Each Part");
        System.out.println("3. Display Total Price for PC");
        System.out.println("*************************************************************");
        System.out.println("Input your choice. Only numbers from 0 to 3.");
    }

    public void ComponentsMenu(){
        System.out.println("*************************************************************");
            System.out.println("Items in your list");
            System.out.println("    Part  |                Model              |  Price  ");
           
    }

    public void ChooseMenu(){
        System.out.println("*************************************************************");
        System.out.println("Input the Id's of the products you want to purchase");
    }
}