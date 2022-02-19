package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodayTest {
	
	public static void main(String[] args) {
		TodayTest test = new TodayTest();
		test.test1();
	}
	
	public void test1() {
		Calendar dday1 = new GregorianCalendar();
		printCalendar(dday1);
		
	}
	
	public void printCalendar(Calendar cal) {
		String[] weeks = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.printf("오늘은 %d년 %d월 %d일 %s요일\n",
				cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH) + 1,
				cal.get(Calendar.DATE),
				weeks[cal.get(Calendar.DAY_OF_WEEK) - 1]);
	}

}
