package com.github.danielfabela.partpicker;
import java.util.Scanner;
class PartPicker{
    public static void main(String[] args){
        // Temporary variables for the PC parts
        String CPU1 = "Ryzen 7 2700X";
        String MotherBoard1 = "MSI B450 TOMAHAWK MAX ATX";
        String GPU1 = "Geforce RTX 2060 Super";
        String RAM1 = "Ripjaws V 16GB DDR4-3600";
        String SSD_Storage1 = "Kingston A4000 240GB";
        String HDD_Storage1 = "Seagate Barracuda 2TB 72000RPM";
        String Power1 = "Corsair CX 550W";
        String Case1 = "Fractal Design ATX";

        // Temporary prices for the parts
        double CPU1_Price = 300.99;
        double MotherBoard1_Price = 115.99;
        double GPU1_Price = 399.99;
        double RAM1_Price = 84.99;
        double SSD_Storage1_Price = 30.99;
        double HDD_Storage1_Price = 50.99;
        double Power1_Price = 90.99;
        double Case1_Price = 70.99;
        double total = 0.0;

        System.out.println("Welcome to Part Picker");
        System.out.println("*************************************");

        System.out.println("Main Menu");
        System.out.println("Choose your parts wisely");
        System.out.println("0. Quit");
        System.out.println("1. CPU");
        System.out.println("2. MotherBoard");
        System.out.println("3. GPU");
        System.out.println("4. RAM");
        System.out.println("5. SSD");
        System.out.println("6. HDD");
        System.out.println("7. Power Supply");
        System.out.println("8. Case");

        System.out.println("*************************************");

        Scanner kb = new Scanner(System.in);
        System.out.println("Input your choice. Only numbers from 0 to 11.");
        int input = kb.nextInt();
        
        System.out.println("*************************************");
        while(input != 0){
            if(input == 1){
                System.out.println("CPU Model 1: " + CPU1 + " Price: $" + CPU1_Price);

                System.out.println("*************************************");
                System.out.println("Choose your CPU");
                System.out.println("1. Model 1");
                System.out.println("2. Model 2");
                System.out.println("*************************************");
                System.out.println("Input your choice. Only numbers from 0 to 2.");
                input = kb.nextInt();
    
                if(input == 1){
                    total = total + CPU1_Price;
                    System.out.println("Total Price = $" + total);
                }
            }
            else if(input == 2){
                System.out.println("MotherBoard Model 1: " + MotherBoard1 + " Price: $" + MotherBoard1_Price);

                System.out.println("*************************************");
                System.out.println("Choose your MotherBoard");
                System.out.println("1. Model 1");
                System.out.println("2. Model 2");
                System.out.println("*************************************");
                System.out.println("Input your choice. Only numbers from 0 to 2.");
                input = kb.nextInt();

                if(input == 1){
                    total = total + MotherBoard1_Price;
                    System.out.println("Total Price = $" + total);
                }
            }
            
            System.out.println("*************************************");
            System.out.println("Main Menu");
            System.out.println("Choose your parts wisely");
            System.out.println("0. Quit");
            System.out.println("1. CPU");
            System.out.println("2. MotherBoard");
            System.out.println("3. GPU");
            System.out.println("4. RAM");
            System.out.println("5. SSD");
            System.out.println("6. HDD");
            System.out.println("7. Power Supply");
            System.out.println("8. Case");
            System.out.println("9. Cooler");
            System.out.println("10. Keyboard & Mouse");
            System.out.println("11. Monitor");

            System.out.println("*************************************");
            System.out.println("Input your choice. Only numbers from 0 to 11.");
            input = kb.nextInt();

        }
    }            
}