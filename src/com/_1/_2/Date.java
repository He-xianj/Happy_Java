package com._1._2;
public class Date {
	private int year=2000;
	private int month=1;
	private int day=1;
	public Date(int year,int month,int day) {
		this.year = year;
		if(month>=12) {
			this.month=12;
		}else if(month<=1){
			this.month=1;
		}else if(month<12&month>1){
			this.month = month;
		}
		if(this.month==1||this.month==3||this.month==5||this.month==7||this.month==8||this.month==10||this.month==12) {
			if(day>=31) {
				this.day=31;
			}else if(day<=1) {
				this.day=1;
			}else{
				this.day = day;
			}
		}else if(this.month==4||this.month==6||this.month==9||this.month==11) {
			if(day>=30) {
				this.day=30;
			}else if(day<=1) {
				this.day=1;
			}else{
				this.day = day;
			}
		}else if(this.month==2) {				
			if(year%4==0&year%100!=0) {
				//判断这一年是不是闰年
				//年份是4的倍数&不是100的倍数；
				if(day>=29) {
					this.day=29;
				}else if(day<=1) {
					this.day=1;
				}else{
					this.day = day;
				}
			}else {
				if(year%400==0) {
					if(day>=29) {
						this.day=29;
					}else if(day<=1) {
						this.day=1;
					}else{
						this.day = day;
					}
					// 或者年份是400的倍数
				 }else {
					 if(day>=28) {
							this.day=28;
						}else if(day<=1) {
							this.day=1;
						}else{
							this.day = day;
						}
					 //其他的年份都不是闰年。
				 }
			}
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month>=12) {
			this.month=12;
		}else if(month<=1){
			this.month=1;
		}else if(month<12&month>1){
			this.month = month;
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			if(day>=31) {
				this.day=31;
			}else if(day<=1) {
				this.day=1;
			}else{
				this.day = day;
			}
		}else if(month==4||month==6||month==9||month==11) {
			if(day>=30) {
				this.day=30;
			}else if(day<=1) {
				this.day=1;
			}else{
				this.day = day;
			}
		}else if(month==2) {				
			if(year%4==0&year%100!=0) {
				//判断这一年是不是闰年
				//年份是4的倍数&不是100的倍数；
				if(day>=29) {
					this.day=29;
				}else if(day<=1) {
					this.day=1;
				}else{
					this.day = day;
				}
			}else {
				if(year%400==0) {
					if(day>=29) {
						this.day=29;
					}else if(day<=1) {
						this.day=1;
					}else{
						this.day = day;
					}
					// 或者年份是400的倍数
				 }else {
					 if(day>=28) {
							this.day=28;
						}else if(day<=1) {
							this.day=1;
						}else{
							this.day = day;
						}
					 //其他的年份都不是闰年,输出no。
				 }
			}
		}
	}
	@Override
	public String toString() {
		return "Date:" + year + "/" + month + "/" + day;
	}
}
