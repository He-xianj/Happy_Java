package com._8;

import java.io.Serializable;

/**（1）	编写汽车类，
 * 包括的属性有汽车编号、汽车品牌、汽车出厂日期、汽车价格，主人编号等属性。
 * 添加无参和有参构造方法；编写打折方法，输入折扣值得到新的价格；
 * 添加toString（）方法。
 * 如果价格低于8万元抛出价格异常。（30分）
 * */
public class Car implements Serializable{
	private int CarID;
	private String brand;
	private String date;
	private int prices;
	private String master;
	public Car() {}
	public Car(int CarID,String brand,String date,int prices,String master) throws CarPricesExcption {
		setCarID(CarID);
		setBrand(brand);
		setDate(date);
		setPrices(prices);
		setMaster(master);
	}
	public void discount(double d) throws CarPricesExcption {
		setPrices((int)(d*getPrices()));
	}
	@Override
	public String toString() {
		return "Car [CarID=" + CarID + ", brand=" + brand + ", date=" + date + ", prices=" + prices + ", master="
				+ master + "]";
	}
	public int getCarID() {
		return CarID;
	}
	public void setCarID(int carID) {
		CarID = carID;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPrices() {
		return prices;
	}
	public void setPrices(int prices) throws CarPricesExcption {
		if(prices<80000) {
			throw new CarPricesExcption();
		}else {
			this.prices = prices;
		}
	}
	public String getMaster() {
		return master;
	}
	public void setMaster(String master) {
		this.master = master;
	}
}
