package ncs.test4;

import java.util.Arrays;
import java.util.Random;

public class TestSort {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] a = new int[10];
		
		for(int i = 0; i<a.length; i++)
		{
			a[i] = rnd.nextInt(50)+51;
		}
		System.out.println("before: " + Arrays.toString(a));
		
		for(int i = 0; i<a.length; i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i] < a[j]) 
				{ 
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		System.out.println("after: " + Arrays.toString(a));
	}
}
