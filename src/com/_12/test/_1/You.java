package com._12.test._1;

import java.net.*;
import java.io.*;
public class You {
	public static void main(String args[]) throws Exception { // �����쳣�׳�
		Socket client = null; // ��ʾ�� ����
		client = new Socket("localhost", 8888);
		BufferedReader buf = null; // һ���Խ������
		PrintStream out = null; // ��������
		BufferedReader input = null; // ���ռ�������
		input = new BufferedReader(new InputStreamReader(System.in));
		buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		out = new PrintStream(client.getOutputStream());
		boolean flag = true; // �����־λ
		while (flag) {
			System.out.print("B A��");
			String str = input.readLine(); // ���ռ��̵�������Ϣ
			out.println(str);
			if ("��ʦ���ã�����".equals(str)) {
				flag = false;
			} else {
				String echo = buf.readLine(); // ���շ��ؽ��
				System.out.println(echo); // �����Ӧ��Ϣ
			}
		}
		buf.close();
		client.close();
	}
}

