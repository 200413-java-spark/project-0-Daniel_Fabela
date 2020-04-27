package com.github.danielfabela.partpicker.components;

public class Moth extends Components{
    public Moth(String Part, String Model, String sPrice){
        super(Part, Model, sPrice);
    }

    @Override
    public double TotalPrice(){
        this.taxes = this.dPrice * this.tax_rate;
        this.total = this.dPrice + this.taxes;

        return this.total;
    }
}