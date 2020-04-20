package com.github.danielfabela.partpicker.io;
import java.util.Scanner;

public class IO {

    public IO(){}

    public int MenuInput(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Input your choice. Only numbers from 0 to 11.");
        int input = kb.nextInt();
        System.out.println("*************************************");

        return input;
    }

    public int ComponentInput(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Input your choice. Only numbers from 0 to 2.");
        int input = kb.nextInt();
        System.out.println("*************************************");

        return input;
    }


}