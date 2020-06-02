package com._12.test._2;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		创建
		ServerSocket ss=new ServerSocket(10086);
		Socket s=ss.accept();
//		接受
		InputStream is=s.getInputStream();
		byte[] b=new byte[1024];
		int num=0;
		while((num=is.read())!=-1) {
			System.out.println((char)num);
		}
		s.close();
	}

}
