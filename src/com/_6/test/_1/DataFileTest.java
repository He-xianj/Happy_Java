package com._6.test._1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 1、	有如下订单
商品名称	商品价格	商品数量
拖鞋	18.9	100
眼镜	25.6	10
太阳伞	34.5	21
按照格式将数据写进文件中，然后再从文件中读出数据，显示在控制台上。
 * */
public class DataFileTest {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\order.txt");
		FileOutputStream fo=new FileOutputStream(f);
		DataOutputStream dos=new DataOutputStream(fo);
		String names[]= {"拖鞋","眼镜","太阳伞"};
		float prices[]= {18.9f,25.6f,34.5f};
		int nums[]= {100,10,21};
		for(int i=0;i<names.length;i++) {
			dos.writeChars(names[i]);
			dos.writeChar('\t');
			dos.writeFloat(prices[i]);
			dos.writeChar('\t');
			dos.writeInt(nums[i]);
			dos.writeChar('\n');
		}
		fo.close();
		dos.close();
	}
}
