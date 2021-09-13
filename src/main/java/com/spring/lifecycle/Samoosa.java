package com.spring.lifecycle;

public class Samoosa {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Samoosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samoosa [price=" + price + "]";
	}
	public void init()
	{
		System.out.println("Inside init methode:");
	}
	public void destroy()
	{
		System.out.println("Inside destrroy method:");
	}
	

}
