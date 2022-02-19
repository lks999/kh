package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalcYourDays {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		CalcYourDays main = new CalcYourDays();
		main.test1();
	}
	
	public void test1() {
		System.out.print("생일 년도를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("생일 월을 입력하세요 : ");
		int month = sc.nextInt();
		System.out.print("생일 일을 입력하세요 : ");
		int date = sc.nextInt();
		
		Calendar today = Calendar.getInstance();
		// D-day 2/21 자정
		Calendar dday = new GregorianCalendar(year, month - 1, date);
		
		// millis초단위 변환후 계산
		long _dday = dday.getTimeInMillis();
		long _today = today.getTimeInMillis(); 
		double diff = ((double)_today - _dday) / 1000 / 60 / 60 / 24; // 밀리초에서 초 -> 분 -> 시 -> 일
		System.out.println(diff);
		
		// 올림처리
		System.out.println("태어난지 " + (int) (Math.ceil(diff)) + "일이 지났습니다.");

	}

}
