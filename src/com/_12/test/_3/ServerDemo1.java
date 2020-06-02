package com._12.test._3;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss=new ServerSocket(10086);
		Socket s=ss.accept();
		
	}

}
