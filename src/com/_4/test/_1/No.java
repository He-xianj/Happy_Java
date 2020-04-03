package com._4.test._1;
/**
 * @see OO
 * */
public class No {

	private static String i;

	public static void main(String[] args) {
		i = null;
		try{
			System.out.println(i.hashCode());
		}catch(NullPointerException e) {
			System.out.println("ø’÷∏’Î“Ï≥£");
		}
	}

}
