package com.student;
import com.school.School;
public class Student {
	private String studentName,grade;

	private School school;
	
	private double averageMarks;
	
	
	private Student (String studentName,String grade, School school, double averageMarks ) {
		this.studentName=studentName;
		this.grade=grade;
		this.school=school;
		this.averageMarks = averageMarks;
		
	}
	public String getStudentName() {
		return studentName;
		
		
	}
	public String getGrade() {
		return grade;
		
	}
	public School getSchool() {
		return school;
		
	}
    public double getAverageMarks() {
     	return averageMarks;
	
}
    public void setStudentName(String studentName) {
    	this.studentName=studentName;
    	
    }
    public void setGrade(String grade) {
    	this.grade=grade;
    	
}
    public void setSchool(School school) {
    	this.school=school;
    	
    	
}
    public void setAveragemarks(double averageMarks) {
    	this.averageMarks=averageMarks;
    	
}
    public String toString() {
    	return "Student Name : "+studentName+"\nStudent grade :"+grade + "\nSchool "+school+"\naverageMarks"+averageMarks;
    	
    }
    public static Student getStudentObject(String studentName ,String grade , School school, double averageMarks) {
    	 if ((averageMarks<=0)&&(averageMarks>=100)|| (school==null )) {
    		 
    	 
    		  return null;
    
    }
    

    
    return new Student(studentName,grade,school,averageMarks);
    
}
}

