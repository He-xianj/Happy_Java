package com._5.test._3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 5��	�½�һ������������ҹ.txt���ļ����ֶ��½������Ѹ��ļ�������D���¡�
 * */
public class Cun {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//����
			File f=new File("D:\\��������ҹ.txt");
			
			if(f.exists()) {
				FileWriter fw=new FileWriter(f);
				//д
				fw.write("��������ҹ \r\n" + 
						"���ߣ�������\r\n" + 
						"������ˮ����ƽ���������¹�������\r\n" + 
						"�����沨ǧ����δ�������������\r\n" + 
						"������ת�Ʒ��飬���ջ��ֽ�������\r\n" + 
						"������˪�����ɣ�͡�ϰ�ɳ��������\r\n" + 
						"����һɫ���˳�������й����֡�\r\n" + 
						"���Ϻ��˳����£����º�������ˣ�\r\n" + 
						"�������������ѣ��������������ơ�\r\n" + 
						"��֪���´����ˣ�������������ˮ��\r\n" + 
						"����һƬȥ���ƣ�������ϲ�ʤ�\r\n" + 
						"˭�ҽ�ҹ�����ӣ��δ���˼����¥��\r\n" + 
						"����¥�����ǻ���Ӧ������ױ��̨��\r\n" + 
						"�����о�ȥ���������Ϸ�������\r\n" + 
						"��ʱ���������ţ�Ը���»����վ���\r\n" + 
						"���㳤�ɹⲻ�ȣ�����ǱԾˮ���ġ�\r\n" + 
						"��ҹ��̶���仨���������벻���ҡ�\r\n" + 
						"��ˮ����ȥ��������̶���¸���б��\r\n" + 
						"б�³����غ�����ʯ��������·��\r\n" + 
						"��֪���¼��˹飬����ҡ����������");
				System.out.println("�ɹ�");
				//��
				fw.close();
			}else {
			System.out.println("�ļ�������");
			}
			System.out.println("over");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
