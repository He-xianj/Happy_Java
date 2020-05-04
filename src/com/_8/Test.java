package com._8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**（2）	使用数组，存放5个汽车对象。
 * 随机生成5个你们班级内的学号，
 * 将这5部车的主人编号设置为这5个人的学号。
 * 并输出这5部车的全部信息。（20分）
 * */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] c=new Car[5];
		try {
//			价格高一点为了打折好打
			c[0]=new Car(7,"东风日产","2019",180000000,"98");
			c[1]=new Car(8,"雪国列车","3013",900000000,"857");
			c[2]=new Car(9,"大风车","2020",930000,"980");
			c[3]=new Car(10,"宝骏","2008",810000000,"8");
			c[4]=new Car(11,"大保健","1989",999000999,"567");
			for(Car p:c) {
				System.out.println(p.toString());
			}
			/**（3）	将上述5部车存入“奖品名单中.txt”中，并从文件中读出，每部车打9折后在存入文件中。（20分）*/
			try {
				FileOutputStream fo1 = new FileOutputStream("D:\\奖品名单中.txt");
				ObjectOutputStream Op=new ObjectOutputStream(fo1);
//				传入
				Op.writeObject(c);
				System.out.println("完成");
				FileInputStream fs;
				fs = new FileInputStream("D:\\奖品名单中.txt");
				ObjectInputStream Op1=new ObjectInputStream(fs);
				Car[] t=(Car[])Op1.readObject();
				Op1.close();
				for(int i=0;i<t.length;i++) {
					t[i].discount(0.9);
				}
//				查看打节效果
				for(Car p:t) {
					System.out.println(p.toString());
				}
				System.out.println("----------------------------");
				FileOutputStream fo2= new FileOutputStream("D:\\奖品名单中.txt");
				ObjectOutputStream Op0=new ObjectOutputStream(fo2);
				Op0.writeObject(t);
				Op.close();
				Op0.close();
				/**（4）	从（3）题后的文件中，取出5部车的对象，放入ArrayList中，
				 * 每部车打五折，再存入文件，并输出到控制台车辆信息。
				 * （30分）*/
				FileInputStream fs1=new FileInputStream("D:\\奖品名单中.txt");
				ObjectInputStream Op2=new ObjectInputStream(fs1);
//				取出5部车的对象
				Car[] t1=(Car[])Op2.readObject();
				Op2.close();
//				取出5部车的对象，放入ArrayList中
				ArrayList<Car> l=new ArrayList<Car>();
				for(Car p:t1)
					l.add(p);
				for(int b=0;b<l.size();b++) {
//					每部车打五折
					l.get(b).discount(0.5);
//					l.set(b, l.get(b));
				}
				FileOutputStream fo3= new FileOutputStream("D:\\奖品名单中.txt");
				ObjectOutputStream Op9=new ObjectOutputStream(fo3);
//				再存入文件
				Op9.writeObject(l);
				Op9.close();
				FileInputStream fs99;
				fs99 = new FileInputStream("D:\\奖品名单中.txt");
				ObjectInputStream Op99=new ObjectInputStream(fs99);
				ArrayList<Car> iu=(ArrayList<Car>)Op99.readObject();
				Op99.close();
//				并输出到控制台车辆信息
				for(int u=0;u<iu.size();u++) {
					System.out.println(iu.get(u).toString());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (CarPricesExcption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
