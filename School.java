package com.school;

public class School {
	String  schoolName;
	static String schoolAddres;
	static String schoolMoto;
	
	
	private School(String schoolName, String schoolAddres, String schoolMoto) {
		this.schoolAddres=schoolAddres;
		this.schoolName=schoolName;
		this.schoolMoto=schoolMoto;
		
	}
public String getSchoolName() {
	return schoolName;
	
}
public String getSchoolAddres() {
	return schoolAddres;
	
}
public String getSchoolMoto() {
	return schoolMoto;
	
}
public void setSchoolName() {
	this.schoolName = schoolName;
	
}
public void setSchoolAddres() {
	this.schoolName= schoolAddres;
	
	
}
public void setSchoolMoto() {
	this.schoolMoto=schoolMoto;
	
}
public String toString() {
	return "schoolname :"+schoolName+"\n SchoolAddres :" +schoolAddres+"\nschoolMoto :"+schoolMoto;
}
public static  School getSchoolObject(String schoolName, String schoolAddres,String schoolMoto) {
 
	if (schoolName.isEmpty() || schoolAddres.isEmpty() ||schoolMoto.isEmpty() || schoolName==null || schoolAddres==null ||schoolMoto==null ) {
		
	
	return null;
}

return new School (schoolName,schoolAddres,schoolMoto);
}
}



