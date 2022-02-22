package com.io.test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {


	public static void main(String[] args) {
		Test1 test = new Test1();
//		test.fileSave();
		test.fileRead();

	}
	
	public void fileSave() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = null;
		
		try
		{
			String data = null;
			
			System.out.println("사용할 파일명 입력 : ");
			String n = br.readLine();
			
			fw = new FileWriter(n);
			
			System.out.println("파일에 저장할 내용을 입력하시오. : ");
			while((data = br.readLine()) != null)
			{
				if("exit".equals(data))
				{
					System.out.println("파일에 성공적으로 저장되었습니다.");
					break;
				}
				fw.write(data);
				fw.write("\n");
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fw.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileReader fr = null;
		
		try
		{
			System.out.print("읽을 파일명 입력 : ");
			String n = br.readLine();
			
			fr = new FileReader(n);
			int data = 0;
			
			while((data = fr.read()) != -1)
			{
				StringBuilder sb = new StringBuilder();
				sb.append((char) data);
				System.out.print(sb.toString());
			}
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fr.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
