import java.lang.*;
import java.util.*;

class Person
{
	Person()
	{
		System.out.println("He is a person");
	}
}

class Student extends Person
{
	String sname;
	Student(String sname)
	{
		this.sname=sname;
	}
}

class Teacher extends Person
{
	double salary;
	String subject;
	Teacher(String subject,double salary)
	{
		this.salary=salary;
		this.subject=subject;
	}
	void print()
	{
		System.out.println("Subject:"+this.subject+"\nSalary:"+this.salary);
	}
}
class CollegeStudent extends Student
{
	int year;
	String major;
	CollegeStudent(String sname,int year,String major)
	{
		super(sname);
		this.year=year;
		this.major=major;
	}
	void print()
	{
		System.out.println("Student name:"+this.sname+"\nYear:"+this.year+"\nMajor:"+this.major);
	}
}
class P3
{
	public static void main(String args[])
	{
		Teacher teacher = new Teacher("Computer Science",60_000.00);
		teacher.print();
		CollegeStudent student = new CollegeStudent("Rajeev",2019,"Communications");
		student.print();
	}
}
