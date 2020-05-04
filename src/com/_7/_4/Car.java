package com._7._4;

public class Car {
	private String name;
	private double carLong;
	private double carWidth;
	private double carHight;
	private String brand;
	private int prices;
	public Car() {};
	public Car(String name,double carLong,double carWidth,double carHight,String brand,int prices) {
		setName(name);
		setCarLong(carLong);
		setCarWidth(carWidth);
		setCarHight(carHight);
		setBrand(brand);
		setPrices(prices);
	}
	public double getCarLong() {
		return carLong;
	}
	public void setCarLong(double carLong) {
		this.carLong = carLong;
	}
	public double getCarWidth() {
		return carWidth;
	}
	public void setCarWidth(double carWidth) {
		this.carWidth = carWidth;
	}
	public double getCarHight() {
		return carHight;
	}
	public void setCarHight(double carHight) {
		this.carHight = carHight;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrices() {
		return prices;
	}
	public void setPrices(int prices) {
		this.prices = prices;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
