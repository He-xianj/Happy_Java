package com._8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**��2��	ʹ�����飬���5����������
 * �������5�����ǰ༶�ڵ�ѧ�ţ�
 * ����5���������˱������Ϊ��5���˵�ѧ�š�
 * �������5������ȫ����Ϣ����20�֣�
 * */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] c=new Car[5];
		try {
//			�۸��һ��Ϊ�˴��ۺô�
			c[0]=new Car(7,"�����ղ�","2019",180000000,"98");
			c[1]=new Car(8,"ѩ���г�","3013",900000000,"857");
			c[2]=new Car(9,"��糵","2020",930000,"980");
			c[3]=new Car(10,"����","2008",810000000,"8");
			c[4]=new Car(11,"�󱣽�","1989",999000999,"567");
			for(Car p:c) {
				System.out.println(p.toString());
			}
			/**��3��	������5�������롰��Ʒ������.txt���У������ļ��ж�����ÿ������9�ۺ��ڴ����ļ��С���20�֣�*/
			try {
				FileOutputStream fo1 = new FileOutputStream("D:\\��Ʒ������.txt");
				ObjectOutputStream Op=new ObjectOutputStream(fo1);
//				����
				Op.writeObject(c);
				System.out.println("���");
				FileInputStream fs;
				fs = new FileInputStream("D:\\��Ʒ������.txt");
				ObjectInputStream Op1=new ObjectInputStream(fs);
				Car[] t=(Car[])Op1.readObject();
				Op1.close();
				for(int i=0;i<t.length;i++) {
					t[i].discount(0.9);
				}
//				�鿴���Ч��
				for(Car p:t) {
					System.out.println(p.toString());
				}
				System.out.println("----------------------------");
				FileOutputStream fo2= new FileOutputStream("D:\\��Ʒ������.txt");
				ObjectOutputStream Op0=new ObjectOutputStream(fo2);
				Op0.writeObject(t);
				Op.close();
				Op0.close();
				/**��4��	�ӣ�3�������ļ��У�ȡ��5�����Ķ��󣬷���ArrayList�У�
				 * ÿ���������ۣ��ٴ����ļ��������������̨������Ϣ��
				 * ��30�֣�*/
				FileInputStream fs1=new FileInputStream("D:\\��Ʒ������.txt");
				ObjectInputStream Op2=new ObjectInputStream(fs1);
//				ȡ��5�����Ķ���
				Car[] t1=(Car[])Op2.readObject();
				Op2.close();
//				ȡ��5�����Ķ��󣬷���ArrayList��
				ArrayList<Car> l=new ArrayList<Car>();
				for(Car p:t1)
					l.add(p);
				for(int b=0;b<l.size();b++) {
//					ÿ����������
					l.get(b).discount(0.5);
//					l.set(b, l.get(b));
				}
				FileOutputStream fo3= new FileOutputStream("D:\\��Ʒ������.txt");
				ObjectOutputStream Op9=new ObjectOutputStream(fo3);
//				�ٴ����ļ�
				Op9.writeObject(l);
				Op9.close();
				FileInputStream fs99;
				fs99 = new FileInputStream("D:\\��Ʒ������.txt");
				ObjectInputStream Op99=new ObjectInputStream(fs99);
				ArrayList<Car> iu=(ArrayList<Car>)Op99.readObject();
				Op99.close();
//				�����������̨������Ϣ
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
