package java022_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date();//日期类
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(System.currentTimeMillis());
		
		//把日期转换字符串
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String sd = format2.format(date);
		System.out.println(sd);
		//把字符串转换日期
		SimpleDateFormat format3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			Date date2 = format3.parse(sd);
			System.out.println(date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//日历类
		Calendar calendar = Calendar.getInstance();
		System.out.println();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH)+1);
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.HOUR));
		calendar.set(Calendar.YEAR, 2015);//置换
		System.out.println(calendar.get(Calendar.YEAR));
		
	}
}













