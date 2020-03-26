package com._0._8;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] aNa={"张三","李四"};
		String[] aSe={"男","女"};
		int[] aAg= {18,21};
		Person1 a=new Person1(aNa, aSe, aAg) ;
		a.bli();
		String[] bJo= {"主播","主持"};
		String[] bDe= {"A部","d部"};
		Teacher b=new Teacher(aNa, aSe, aAg,bJo,bDe);
		b.bli();
		int[] cSI= {777,888};
		String[] cMa= {"班长","课代表"};
		int[] cDa= {2019,2019};
		Student c=new Student(aNa, aSe, aAg, cSI, cMa, cDa);
		c.bli();
		}
	}
