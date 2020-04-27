package com.github.danielfabela.partpicker;
import java.util.List;
import java.io.File;

import com.github.danielfabela.partpicker.components.Components;
import com.github.danielfabela.partpicker.components.ComponentsFactory;
import com.github.danielfabela.partpicker.menus.Menu;
import com.github.danielfabela.partpicker.io.IO;
import com.github.danielfabela.partpicker.io.Dao;
import com.github.danielfabela.partpicker.io.sqlComponentsRepository;
import com.github.danielfabela.partpicker.io.sqlDataSource;

class PartPicker{
    public static void main(String[] args){
        Menu menu = new Menu();
        
        IO inputtaker = new IO();
        int userInput = 0;

        menu.MainMenu();
        userInput = inputtaker.MenuInput();
        while(userInput != 0){
            if(userInput == 1){
                menu.ComponentsMenu();
                Dao<Components> inputparser = new IO();
                List<Components> inventory = inputparser.File_Read();
                for(Components parts: inventory){
                    parts.TotalPrice();
                }

                //Insert components with totals into the database
                sqlDataSource dataSource = sqlDataSource.getInstance();
                Dao<Components> partsRepository = new sqlComponentsRepository(dataSource);
                partsRepository.writeAll(inventory);

                //Read all the components from the database
                inventory = partsRepository.File_Read();
                for(Components parts: inventory){
                    System.out.println(parts);
                }
            }

            menu.MainMenu();
            userInput = inputtaker.MenuInput();
        }
    }
}            
