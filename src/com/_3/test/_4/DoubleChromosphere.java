package com._3.test._4;

/**
 * <h1>ʵ��˫ɫ���Ʊ</h1>
 * <p>���һ������ģ��˫ɫ���ѡ�Ź��̣�6������+1�����򣩣�</p>
 * <p>Ҫ�����ɵ�6��������벻�ظ����ִ�С�ڣ�01-33��֮�䣬�����С��01-16��֮�䡣</p>
 * <p>˼·��</p>
 * <ol>
 *<li>����һ��int���͵�һά����balls����������33������ı��</li>
 *<li>����һ��boolean���͵�һά����flags����������33�������״̬��Ĭ��ȫ��Ϊfalse</li>
 *       �����磺flags[0]=true,��ζ�ű�ŵ���balls[0]����������Ѿ���ȡ�����ˣ�
 *<li>ȥ�ڳ���֮ǰ��������һ���������������ķ�Χ��33֮�䣬 
 *    ���ݲ������������ֵȥballs������ȡ��Ӧλ�õĲ����ţ�</li>
 *���磺  a.�����������ʹ��index��������
 *       b.���indexֵΪ5�������жϱ�ŵ���balls[5]�Ĳ�����û�б�ȡ������
 *       c.���û�б�ȡ������ȡ�����򣬼��ڿ���̨�������ı��
 *       d.����Ѿ���ȡ���ˣ����ظ�����a,b,c��     ��
 *<li>��Ҫȡ6�κ���ѭ��������֪������ʹ��forѭ��ʵ�֣�</li>
 *<li>����ֱ������һ��1-16�����������arr[6]��</li>
 *<hr/>
 *<center>           12 21 33 14 01 05��15
 * */
public class DoubleChromosphere {
	public static void main(String[] args) {
		int[] balls=new int[33];
		boolean[] flags=new boolean[33];
		int[] arr=new int[7];
		for(int r=0;r<=32;r++) {
			balls[r]=r+1;
			flags[r]=false;
//			System.out.println(balls[r]);
		}
		int index;
		for(int t=1;t<=6;t++) {
			do {
				index=(int)(Math.random()*100+1);
				if(index<=33&&flags[index-1])
					break;
			}while(index>33);
			flags[index-1]=true;
//			System.out.print(index+" ");
			arr[t-1]=index;
			
		}
		do {
			index=(int)(Math.random()*100+1);
		}while(index>16);
		arr[6]=index;
		for (int i = 0;i<7 ; i++) {
           if(i<6) {
        	   System.out.print(arr[i]+" ");
           }else {
        	   System.out.print(","+arr[i]);
           }
        }
	}
}
