//Person Class
import java.lang.*;
import java.util.*;

class Person
{
	String name;
	Person(String name)
	{
		this.name=name;
	}
}

//Employee Class

class Employee extends Person	
{
	private double annualSalary;
	private int year;
	private String insuranceNumber;
	public Employee(double a,int y,String i,String name)
	{
		super(name);
		annualSalary=a;
		year=y;
		insuranceNumber=i;
	}
	double getannualsalary()
	{
		return this.annualSalary;	
	}
	int getstarttowork()
	{
		return this.year;
	}
	String getnationalinsurance()
	{
		return this.insuranceNumber;	
	}
}
//Test Employee Class (Main class)

class TestEmployeeP2
{
	public static void main(String args[])
	{
		Employee employee = new Employee(1_00_000.00,2019,"9441579088","Dennis Richie");
		System.out.println("Employee Name:"+employee.name+"\nEmployee Year:"+employee.getstarttowork()+"\nEmployee Insurance Number:"+employee.getnationalinsurance()+"\nEmployee annual Salary:"+employee.getannualsalary());
	}
}
