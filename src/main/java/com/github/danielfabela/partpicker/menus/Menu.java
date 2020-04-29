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
        System.out.println("1. See your Listed Components from a File");
        System.out.println("2. Calculate Total Price of Each Part and Display it");
        System.out.println("3. Display Total Price for your parts in Browser");
        System.out.println("*************************************************************");
        System.out.println("Input your choice. Only numbers from 0 to 3.");
    }

    public void ComponentsMenu(){
        System.out.println("*************************************************************");
            System.out.println("Items in your list");
            System.out.println("    Part  |                Model              |  Price  ");
           
    }

    public void FileMenu(){
        System.out.println("*************************************************************");
        System.out.println("Input the name of the File you want to calculate total prices");
    }

    public void ListMenu(){
        System.out.println("*************************************************************");
        System.out.println("List of all components with total prices");
        System.out.println();
        System.out.println("Part    |    Model    |    Price    |    Taxes    |    Total");
        System.out.println();
    }
}