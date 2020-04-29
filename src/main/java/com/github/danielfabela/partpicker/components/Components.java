package com.github.danielfabela.partpicker.components;

public abstract class Components implements TaxComputation {
    protected int id;
    // Variables to store the data from file
    protected String Part;
    protected String Model;
    protected String sPrice;
    // Variable to store the sPrice converted to double
    protected double dPrice;
    // Current tax rate variable
    protected double tax_rate = 0.0625;
    // Variables to hold the calculated taxes and the totals
    protected double taxes;
    protected double total;

    // Deafault constructor 
    public Components(String Part, String Model, String sPrice){
        this.Part = Part;
        this.Model = Model;
        this.sPrice = sPrice;
        parseToDouble();
    }

    // Constructor to hold all the file data and the calculated data
    public Components(int id, String Part, String Model, String sPrice, double taxes, double total){
        this.id = id;
        this.Part = Part;
        this.Model = Model;
        this.sPrice = sPrice;
        this.taxes = taxes;
        this.total = total;
        parseToDouble();
    }

    // Getters and setters
    public int getId() {
		return id;
    }
    
    public String getPart() {
		return Part;
	}

	public String getModel() {
		return Model;
	}

	public String getPrice() {
		return sPrice;
	}

	public double getTaxes() {
		return taxes;
    }
    
    public double getTotal() {
		return total;
    }
    
    public void setTaxes(double taxes) {
		this.taxes = taxes;
    }

	  public void setTotal(double total) {
		this.total = total;
    }
    
    // Method to parse the sPrice string and convert it to double
    public void parseToDouble(){
        try{
            this.dPrice = new Double(sPrice);
        } catch(NumberFormatException e){
            System.err.println("Failure to parse string: " + this.sPrice);
        }
    }

	/*@Override
	public String toString() {
		StringBuilder out = new StringBuilder();
		out.append(this.id);
    out.append(",");
    out.append(this.Part);
    out.append(",");
		out.append(this.Model);
		out.append(",");
		out.append(this.sPrice);
		out.append(",");
    out.append(this.taxes);
    out.append(",");
		out.append(this.total);
		return out.toString();
  }*/
  
  @Override
	public String toString() {
		StringBuilder out = new StringBuilder();
		//out.append(this.id);
    //out.append(",");
    out.append(this.Part);
    out.append("  |  ");
		out.append(this.Model);
		out.append("  |  $");
		out.append(this.sPrice);
		out.append("  |  $");
    out.append(this.taxes);
    out.append("  |  $");
		out.append(this.total);
		return out.toString();
  }

}