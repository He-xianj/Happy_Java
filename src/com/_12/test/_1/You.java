package com._12.test._1;

import java.net.*;
import java.io.*;
public class You {
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
			System.out.print("B A：");
			String str = input.readLine(); // 接收键盘的输入信息
			out.println(str);
			if ("老师不让！！！".equals(str)) {
				flag = false;
			} else {
				String echo = buf.readLine(); // 接收返回结果
				System.out.println(echo); // 输出回应信息
			}
		}
		buf.close();
		client.close();
	}
}

