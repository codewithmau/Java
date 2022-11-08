package com.comparable.project;

public class Laptop implements Comparable<Laptop> {
	
	private int ram;
	private String brand;
    private double price;
    
    
	public Laptop(int ram, String brand, double price) {
		super();
		this.ram = ram;
		this.brand = brand;
		this.price = price;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", brand=" + brand + ", price=" + price + "]";
	}


	@Override
	public int compareTo(Laptop l) {
		
		//if(ram == l.ram)
		//return 0;
		if(ram < l.ram)
			return -1;
		else if(ram > l.ram)
		    return 1;
		else
		    return 0; // -1
	}
    

}
