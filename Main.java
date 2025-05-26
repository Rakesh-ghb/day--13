package com.main;
import com.school.School;
import com.student.Student;
public class Main {
	public static void main(String[] args) {
	School school =School.getSchoolObject("omega school","hyd","improve student knowldge");
Student student=Student.getStudentObject("Rakesh", "A", school, 95);
	if(school==null && student==null) {
		System.out.println("Enter all the details properly");
	}
	else {
		System.out.println("School details ");
		System.out.println(school);
		System.out.println("Student details");
		System.out.println(student);
	}
}


	
	




}
