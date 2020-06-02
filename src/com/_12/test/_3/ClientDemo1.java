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
		System.out.println("请输入用户名");
		String userName=sc.nextLine();//输入用户
		System.out.println("请输入密码");
		String password=sc.nextLine();//输入密码
		bw.write(userName);
		bw.newLine();//下
		bw.write(password);
		bw.newLine();
		bw.flush();
		s.shutdownOutput();//输入文本完成
		String into=br.readLine();
		System.out.println(into);
		s.close();
		sc.close();
		//关闭
	}

}
