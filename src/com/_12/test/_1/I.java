package com._12.test._1;

import java.net.*;
import java.io.*;
public class I {
	public static void main(String args[]) throws Exception { // 所有异常抛出
		ServerSocket server = null; // 定义ServerSocket类
		Socket client = null; // 表示客 户端
		BufferedReader buf = null; // 接收输入流
		PrintStream out = null; // 打印流输出最方便
		server = new ServerSocket(8888); // 服务器在8888端口上监听
		boolean f = true; // 定义个标记位
		while (f) {
			System.out.println("服务器运行，等待客户端连接。");
			client = server.accept(); // 得到连接，程序进入到阻塞状态
			out = new PrintStream(client.getOutputStream());
			// 准备接收客户端的输入信息
			buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
			boolean flag = true; // 标志位，表示可以一直接收并回应信息
			while (flag) {
				String str = buf.readLine(); // 接收客户端发送的内容
				if (str == null || "".equals(str)) { // 表示没有内容
					flag = false; // 退出循环
				} else {
					if ("你好".equals(str)) { // 如果输入的内容为你说哪表示结束
						out.println("很好");
						str = buf.readLine();
						if("你的作业做了吗？".equals(str)) {
							out.println("AB：做好了，你想干什么？"); // 回应信息
							str = buf.readLine();
							str = buf.readLine();
							if ("你说哪".equals(str)) {
								flag = false;
								out.println("AB：老师不让！！！"); // 回应信息
							}
						}
					} else {
						out.println("AB： " + str); // 回应信息
					}
				}
			}
			client.close();
		}
		server.close();
	}
}

