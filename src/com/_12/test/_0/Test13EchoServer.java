package com._12.test._0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner; 
import java.net.*;
import java.io.*;
public class Test13EchoServer {
	public static void main(String args[]) throws Exception { // �����쳣�׳�
		ServerSocket server = null; // ����ServerSocket��
		Socket client = null; // ��ʾ�� ����
		BufferedReader buf = null; // ����������
		PrintStream out = null; // ��ӡ��������
		server = new ServerSocket(8888); // ��������8888�˿��ϼ���
		boolean f = true; // ��������λ
		while (f) {
			System.out.println("���������У��ȴ��ͻ������ӡ�");
			client = server.accept(); // �õ����ӣ�������뵽����״̬
			out = new PrintStream(client.getOutputStream());
			// ׼�����տͻ��˵�������Ϣ
			buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
			boolean flag = true; // ��־λ����ʾ����һֱ���ղ���Ӧ��Ϣ
			while (flag) {
				out.println("�������˺�");
				String str = buf.readLine(); // ���տͻ��˷��͵�����
				if (str == null || "".equals(str)) { // ��ʾû������
					out.println("ʧ��");
					flag = false; // �˳�ѭ��
				} else {
					if ("10086".equals(str)) { 
							out.println("����������");
							String str1 = buf.readLine();
							if("10087".equals(str1)) {
								out.println("�ɹ�");
								flag = false;
							}else {
								out.println("ʧ��");
							}
							
					} else {
						out.println("ʧ��"); // ��Ӧ��Ϣ
					}
				}
			}
			client.close();
		}
		server.close();
	}
}


