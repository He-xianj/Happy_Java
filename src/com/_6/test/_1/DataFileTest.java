package com._6.test._1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 1��	�����¶���
��Ʒ����	��Ʒ�۸�	��Ʒ����
��Ь	18.9	100
�۾�	25.6	10
̫��ɡ	34.5	21
���ո�ʽ������д���ļ��У�Ȼ���ٴ��ļ��ж������ݣ���ʾ�ڿ���̨�ϡ�
 * */
public class DataFileTest {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\order.txt");
		FileOutputStream fo=new FileOutputStream(f);
		DataOutputStream dos=new DataOutputStream(fo);
		String names[]= {"��Ь","�۾�","̫��ɡ"};
		float prices[]= {18.9f,25.6f,34.5f};
		int nums[]= {100,10,21};
		for(int i=0;i<names.length;i++) {
			dos.writeChars(names[i]);
			dos.writeChar('\t');
			dos.writeFloat(prices[i]);
			dos.writeChar('\t');
			dos.writeInt(nums[i]);
			dos.writeChar('\n');
		}
		fo.close();
		dos.close();
	}
}
