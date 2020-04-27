package com.github.danielfabela.partpicker.components;

public class Cpu extends Components {
    public Cpu(String Part, String Model, String sPrice){
        super(Part, Model, sPrice);
    }

    @Override
    public double TotalPrice(){
        this.taxes = this.dPrice * this.tax_rate;
        this.total = this.dPrice + this.taxes;

        return this.total;
    }
}