package com._7._4;

import java.util.HashMap;
import java.util.Map;

public class Maptest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car("���籾��-����", 4756 , 1804 , 1509 , "���籾��", 99800);
		Car c2=new Car("�׿���˹NX", 4640, 1845, 1645, "�׿���˹", 304800);
		Car c3=new Car("����",4640, 1780, 1455, "��������", 115800);
		Map<Car,Integer> m=new HashMap<Car, Integer>();
		m.put(c1, c1.getPrices());
		m.put(c2, c2.getPrices());
		m.put(c3, c3.getPrices());
		System.out.println(m.keySet());
		System.out.println(m.entrySet());
	}

}
