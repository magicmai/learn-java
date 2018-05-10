package chap05.sec01;

import java.util.Calendar;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH) + 1);
		
		// output the time
		System.out.println("Now:"+calendar.get(Calendar.YEAR)+"-"
		+(calendar.get(Calendar.MONTH)+1)+"-"
		+calendar.get(Calendar.DAY_OF_MONTH)+" "
		+calendar.get(Calendar.HOUR_OF_DAY)+":"
		+calendar.get(Calendar.MINUTE)+":"
		+calendar.get(Calendar.SECOND)+" "
		+calendar.get(Calendar.DAY_OF_WEEK)
		);
	}
}
