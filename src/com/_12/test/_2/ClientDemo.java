package com._12.test._2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
//		����
		Socket s=new Socket(InetAddress.getLocalHost(),10086);
		OutputStream out=s.getOutputStream();
//		����
		out.write(97);
		out.write(98);
		out.write(99);
//		�ر�
		out.close();
		s.close();
	}

}
