package com.github.danielfabela.partpicker.components;
import com.github.danielfabela.partpicker.io.IO;
import com.github.danielfabela.partpicker.menus.Menu;
import java.util.List;
import java.io.File;

public abstract class Components {
    protected String id;
    protected String Model;
    protected String Price;
    protected double subtotal;
    protected double taxes;
    protected double total;

    public Components(String id, String Model, String Price){
        this.id = id;
        this.Model = Model;
        this.Price = Price;
    }

    public Components(String id, String Model, String Price, double subtotal, double taxes, double total){
        this.id = id;
        this.Model = Model;
        this.Price = Price;
        this.subtotal = subtotal;
        this.taxes = taxes;
        this.total = total;
    }

    //public Components getComponents(String id, String Model, double Price){
        
   // }
    
}