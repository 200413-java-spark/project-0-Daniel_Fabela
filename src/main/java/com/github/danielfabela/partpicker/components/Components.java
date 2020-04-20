package com.github.danielfabela.partpicker.components;

public class Components {
    // Temporary variables for the PC parts
    protected String CPU1 = "Ryzen 7 2700X";
    protected String MotherBoard1 = "MSI B450 TOMAHAWK MAX ATX";
    // Temporary prices for the parts
    public double CPU1_Price = 300.99;
    public double MotherBoard1_Price = 115.99;

    /*String GPU1 = "Geforce RTX 2060 Super";
    String RAM1 = "Ripjaws V 16GB DDR4-3600";
    String SSD_Storage1 = "Kingston A4000 240GB";
    String HDD_Storage1 = "Seagate Barracuda 2TB 72000RPM";
    String Power1 = "Corsair CX 550W";
    String Case1 = "Fractal Design ATX";*/

    /*double GPU1_Price = 399.99;
    double RAM1_Price = 84.99;
    double SSD_Storage1_Price = 30.99;
    double HDD_Storage1_Price = 50.99;
    double Power1_Price = 90.99;
    double Case1_Price = 70.99;*/
    
    public Components(){}

    public void CPU(){
        System.out.println("CPU Model 1: " + this.CPU1 + " Price: $" + this.CPU1_Price);
    }

    public void Motherboard(){
        System.out.println("CPU Model 1: " + this.MotherBoard1 + " Price: $" + this.MotherBoard1_Price);
    }
}