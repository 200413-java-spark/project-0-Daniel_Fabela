package com.github.danielfabela.partpicker;
import java.util.List;
import com.github.danielfabela.partpicker.components.Components;
import com.github.danielfabela.partpicker.menus.Menu;
import com.github.danielfabela.partpicker.io.IO;

class PartPicker{
    public static void main(String[] args){

        // Instantiate the objects
        Components component = new Components();
        Menu mainMenu = new Menu();
        IO input = new IO();
        int userinput = 0;

        /*List<String> specs = input.readAll();
        for(String part: specs){
            System.out.println(part);
        }*/
        // Call to display the main menu
        mainMenu.MainMenu();
        // Take the user input and store it in a variable
        userinput = input.MenuInput();
        component.Userchoices(userinput);
    }
}            
