package com._12.test._3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientDemo1 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s=new Socket("localhost",10086);
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		Scanner sc=new Scanner(System.in);
		System.out.println("�������û���");
		String userName=sc.nextLine();//�����û�
		System.out.println("����������");
		String password=sc.nextLine();//��������
		bw.write(userName);
		bw.newLine();//��
		bw.write(password);
		bw.newLine();
		bw.flush();
		s.shutdownOutput();//�����ı����
		String into=br.readLine();
		System.out.println(into);
		s.close();
		sc.close();
		//�ر�
	}

}
