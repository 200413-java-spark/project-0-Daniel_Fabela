package com.github.danielfabela.partpicker;

import java.io.File;
import java.util.List;
//import java.io.File;

import com.github.danielfabela.partpicker.components.Components;
//import com.github.danielfabela.partpicker.components.ComponentsFactory;
import com.github.danielfabela.partpicker.menus.Menu;
import com.github.danielfabela.partpicker.server.HttpServer;
import com.github.danielfabela.partpicker.io.IO;
import com.github.danielfabela.partpicker.io.Dao;
import com.github.danielfabela.partpicker.io.sqlComponentsRepository;
import com.github.danielfabela.partpicker.io.sqlDataSource;

class PartPicker{
    public static void main(String[] args){
        Menu menu = new Menu();
        IO inputtaker = new IO();
        int userInput = 0;
        String fileinput = null;

        // Display the main menu
        menu.MainMenu();
        // Take the input from the user
        userInput = inputtaker.MenuInput();
        // Main loop to accept user input and perform actions
        while(userInput != 0){
            if(userInput == 1){
                
            } 
            else if (userInput == 2){
                // Display File menu
                menu.FileMenu();
                // Store the input in an empty string
                fileinput = inputtaker.fileInput();
                // Create a new file with name inputted name
                File input = new File(fileinput);
                // Parse the input file and read the file
                Dao<Components> inputparser = new IO(input);
                List<Components> inventory = inputparser.File_Read();
                // Loop to calculate the taxes and totals of each part
                for(Components parts: inventory){
                    parts.TotalPrice();
                }

                // Insert components with totals into the database
                sqlDataSource dataSource = sqlDataSource.getInstance();
                Dao<Components> partsRepository = new sqlComponentsRepository(dataSource);
                partsRepository.writeAll(inventory);

                // Read all the components from the database
                inventory = partsRepository.File_Read();
                for(Components parts: inventory){
                    System.out.println(parts);
                }  
            }
            else if (userInput == 3){
                // Connect to an http server
                HttpServer server = new HttpServer();
                server.listen();
            }
            else{
                // Help output for the user
                System.out.println("Usage of the App:");
                System.out.println("	Input only numbers from 0 to 3 in Main Menu");
                System.out.println("	Input an existing file in the File Menu");
            }
            
            menu.MainMenu();
            userInput = inputtaker.MenuInput();
        }
    }
}            
