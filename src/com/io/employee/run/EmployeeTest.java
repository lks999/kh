package com.io.employee.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.io.employee.model.vo.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeTest test = new EmployeeTest();
//		test.saveEmployee();
		test.loadEmployee();

	}
	
	public void saveEmployee() {
		
		Employee[] employee = new Employee[3];
		
		employee[0] = new Employee(0, "홍길동", '남',"010-1212-1212", "영업부", 3000000, 0.15);
		employee[1] = new Employee(1, "유관순", '여',"010-3131-3131", "사업부", 3000000, 0.25);
		employee[2] = new Employee(2, "신사임당", '여',"010-5151-4141", "영업부", 3000000, 0.35);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat")))
		{
			for(int i = 0; i < employee.length; i++)
			{
				oos.writeObject(employee[i]);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void loadEmployee() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.dat")))
		{
			Employee[] employee = new Employee[3];
			
			for(int i = 0; i < employee.length; i++)
			{
				employee[i] = (Employee) ois.readObject();
				employee[i].printEmployee();
			}
		} 
		catch (IOException | ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
	}

}
