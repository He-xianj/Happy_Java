package com._12.test._0;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

import java.net.*;
import java.io.*;
public class Test13EchoClient {
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
			String echo = buf.readLine(); // ���շ��ؽ��
			System.out.println(echo); // �����Ӧ��Ϣ
			String str1 = input.readLine(); // ���ռ��̵�������Ϣ
			out.println(str1);
			if ("�ɹ�".equals(str1)||"ʧ��".equals(str1)) {
				flag = false;
			}
		}
		buf.close();
		client.close();
	}
}

