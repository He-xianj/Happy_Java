package com._3.test._4;

/**
 * <p>实现双色球彩票
 * <p>设计一个程序，模拟双色球的选号过程（6个红球+1个蓝球），
 * <p>要求：生成的6个红球号码不重复数字大小在（01-33）之间，蓝球大小（01-16）之间。
 * <p>思路：
 *<li> 1）创建一个int类型的一维数组balls，用来保存33个彩球的编号
 *<li> 2）创建一个boolean类型的一维数组flags，用来保存33个红球的状态，默认全部为false
 *       （比如：flags[0]=true,意味着编号等于balls[0]的这个彩球已经被取出来了）
 * <li>3）去在出号之前，先生成一个随机数，随机数的范围在33之间， 
 *        根据产生的随机数的值去balls数组里取对应位置的彩球编号：
 *比如：  a.产生的随机数使用index变量保存
 *       b.如果index值为5，则先判断编号等于balls[5]的彩球有没有被取出来过
 *       c.如果没有被取过，则取出该球，即在控制台输出该球的编号
 *       d.如果已经被取过了，则重复步骤a,b,c；     ）
 *<li> 4）需要取6次红球（循环次数已知，可以使用for循环实现）
 *<li> 5）蓝球直接生成一个1-16的整数存放于arr[6]；
 *<p>EX           12 21 33 14 01 05，15
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
