package com.github.danielfabela.partpicker.components;

public class Ssd extends Components{
    public Ssd(String Part, String Model, String sPrice){
        super(Part, Model, sPrice);
    }

    @Override
    public double TotalPrice(){
        this.taxes = this.dPrice * this.tax_rate;
        this.total = this.dPrice + this.taxes;

        return this.total;
    }

}