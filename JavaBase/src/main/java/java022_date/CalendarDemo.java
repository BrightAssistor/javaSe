package java022_date;

import java.util.Scanner;

public class CalendarDemo {
	public static void main(String[] args) {
		int year;
		int month;
		boolean isRn;
		int totalDays = 0;
		System.out.println("*******************使用万年历***********************\n");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年:");
		year = input.nextInt();
		System.out.println("请输入月:");
		month = input.nextInt();
		// 判断输入的年是否是闰年
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			isRn = true;
		} else {
			isRn = false;
		}

		if (isRn) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "非闰年");
		}

		// 求出年的总天数
		for (int i = 1900; i < year; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				totalDays += 366;
			} else {
				totalDays += 365;
			}

		}

		// 计算输入月份之前的天数
		int days = 0;
		for (int i = 1; i <= month; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 2:
				if (isRn) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			default:
				days = 30;
			}

			//输入月的天数保存在days中，但没有加进去
			if (i != month) {
				totalDays += days;
			}
		}
		
		//求出是星期几, 其实就是前面\t的个数
		int beforeDays;
		beforeDays=1+totalDays%7;
		if(beforeDays==7){
			beforeDays=0;//代表星期天，没有\t
		}
		
		System.out.println("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		//先打印\t
		for(int i=0;i<beforeDays;i++){
			System.out.print("\t");
		}
		//打印日期
		for(int i=1;i<=days;i++){
			System.out.print(i+"\t");
			//满7个换行
			if((i+beforeDays)%7==0){
				System.out.println();
			}
		}

	}
}
