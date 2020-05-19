package com._9.test._4;

import java.util.HashMap;
/**（1）创建一个类Book包含属性：id（编号），title（书名）使用构造方法进行初始化重写toString()方法，返回title属性的值
（2）创建一个类BookTest，完成如下任务：使用HashMap进行存储，键为Book对象的编号，值为Book对象、通过编号获取Book对象，并打印该书的书名。
*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] b=new Book[3];
		b[0]=new Book(1,"学生手册");
		b[1]=new Book(2,"青春修炼手册");
		b[2]=new Book(3,"高等数学");
		HashMap<Integer, Book> m=new HashMap<Integer, Book>();
		m.put(b[0].getId(),b[0]);
		m.put(b[1].getId(),b[1]);
		m.put(b[2].getId(),b[2]);
		System.out.println(m.get(2).getTitle());
		System.out.println(m.get(3).getTitle());
		System.out.println(m.get(1).getTitle());
	}

}
