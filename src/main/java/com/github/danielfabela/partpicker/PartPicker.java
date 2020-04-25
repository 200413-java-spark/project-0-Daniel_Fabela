package com.github.danielfabela.partpicker;
import java.util.List;
import com.github.danielfabela.partpicker.components.Components;
import com.github.danielfabela.partpicker.menus.Menu;
import com.github.danielfabela.partpicker.io.IO;

class PartPicker{
    public static void main(String[] args){
        Menu menu = new Menu();
        IO inputparser = new IO();
        int userInput = 0;

        menu.MainMenu();
        userInput = inputparser.MenuInput();
        while(userInput != 0){
            if(userInput == 1){
                List<String> inventory = inputparser.File_Read();
                for(String parts: inventory){
                System.out.println(parts);
                }

            }

            menu.MainMenu();
            userInput = inputparser.MenuInput();
        }
    }
}            
