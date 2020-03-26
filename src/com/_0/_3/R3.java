package com._0._3;
/**
 * 1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
 * 输出格式:按从小到大的顺序输出满足条件的四位十进制数。
 * */
public class R3 {
	public static void main(String[] args) {
		for(int mirror=10,a=0,b=0,c=0;mirror<=99;mirror++) {
			a=mirror%10;
			//取个位
			b=mirror/10;
			//取十位	
			c=mirror*100+a*10+b;
			//求与像1221那样的数字
			if((mirror-9)%10==0) {
//为了方便查看十个为一行
				System.out.print(c+"\n");
			}else {
				System.out.print(c+" ");
				//按顺序输出满足条件的四位十进制数。
			}
		}
	}
}

