package com.danunaik.firstspring;

 

public class Student { 
	
	private String studentName; 
	private String studentCourse;
	
	public String getStudentCourse() 
	{ 
		return studentCourse; 
	} 

	public void setStudentCourse(String studentCourse) 
	{ 
		this.studentCourse = studentCourse; 
	} 

	public String getStudentName() 
	{ 
	return studentName; 
	} 

	public void setStudentName(String studentName) 
	{ 
		this.studentName = studentName; 
	} 

	

	@Override public String toString() 
	{ 
		return "student Name is :"+studentName+"  The Course is : "+studentCourse;
	} 
}
