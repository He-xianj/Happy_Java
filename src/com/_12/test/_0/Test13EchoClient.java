package com._12.test._0;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

import java.net.*;
import java.io.*;
public class Test13EchoClient {
	public static void main(String args[]) throws Exception { // 所有异常抛出
		Socket client = null; // 表示客 户端
		client = new Socket("localhost", 8888);
		BufferedReader buf = null; // 一次性接收完成
		PrintStream out = null; // 发送数据
		BufferedReader input = null; // 接收键盘数据
		input = new BufferedReader(new InputStreamReader(System.in));
		buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		out = new PrintStream(client.getOutputStream());
		boolean flag = true; // 定义标志位
		while (flag) {
			String echo = buf.readLine(); // 接收返回结果
			System.out.println(echo); // 输出回应信息
			String str1 = input.readLine(); // 接收键盘的输入信息
			out.println(str1);
			if ("成功".equals(str1)||"失败".equals(str1)) {
				flag = false;
			}
		}
		buf.close();
		client.close();
	}
}

