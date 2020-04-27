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
        Dao<Components> inputparser = new IO();
        IO inputtaker = new IO();
        int userInput = 0;

        menu.MainMenu();
        userInput = inputtaker.MenuInput();
        while(userInput != 0){
            if(userInput == 1){
                menu.ComponentsMenu();
                List<Components> inventory = inputparser.File_Read();
                for(Components parts: inventory){
                System.out.println(parts);
                }

            }

            menu.MainMenu();
            userInput = inputtaker.MenuInput();
        }
    }
}            
