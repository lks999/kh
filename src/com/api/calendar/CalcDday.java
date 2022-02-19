package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalcDday {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CalcDday main = new CalcDday();
		main.test1();

	}
	
	public void test1() {
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		System.out.print("일을 입력하세요 : ");
		int date = sc.nextInt();
		
		Calendar today = Calendar.getInstance();
		Calendar dday = new GregorianCalendar(year, month - 1, date);
		
		long _dday = dday.getTimeInMillis();
		long _today = today.getTimeInMillis(); 

		double diff = (int) ((double)_dday - _today) / 1000 / 60 / 60 / 24;
		
		if(diff > 0)
		{
			System.out.println((int) (Math.ceil(diff)) + "일 남았습니다.");
		}
		else if(diff == 0)
		{
			System.out.println("D-DAY입니다.");
		}
		else if(diff < 0)
		{
			System.out.println((int) (Math.ceil(diff)*-1) + "일 지났습니다.");
		}
		
	}

}
