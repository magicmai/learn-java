package chap05.sec01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
	
	/**
	 * 将日期对象格式化为指定格式的日期字符串
	 * @param date 传入的日期对象
	 * @param format 格式
	 * @return
	 */
	public static String formatDate(Date date, String format) {
		String result = "";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		if (date != null) {
			result = sdf.format(date);
		}
		return result;
	}
	
	/**
	 * 将日期字符串转换成一个日期对象
	 * @param dateStr 日期字符串
	 * @param format  格式
	 * @return
	 * @throws ParseException 
	 */
	public static Date formatDate(String dateStr, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(dateStr);
	}

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
//		System.out.println(sdf.format(date));
		
		String dateStr = "2017-05-06 15:52:51";
		Date date2 = formatDate(dateStr, "YYYY-MM-dd HH:mm:ss");
		
		System.out.println(formatDate(date, "YYYY-MM-dd HH:mm:ss"));
		System.out.println(formatDate(date, "YYYY年MM月dd日 HH:mm:ss"));
		
		System.out.println(formatDate(date2, "YYYY-MM-dd HH:mm:ss"));
	}
}