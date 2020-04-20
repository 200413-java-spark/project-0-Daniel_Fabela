package com.github.danielfabela.partpicker.io;
import java.util.Scanner;

public class IO {

    public IO(){}

    public int MenuInput(){
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        return input;
    }
}