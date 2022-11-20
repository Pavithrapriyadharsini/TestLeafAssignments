package org.student;

public class Students {

	void getStudentInfo(int id) {
		System.out.println("Student ID: "+id);
	}
	
	void getStudentInfo(int id,String name) {
		System.out.println("Student ID: "+id+"\nStudent Name: "+name);
	}
	
	void getStudentInfo(String email,String phoneNumber) {
		System.out.println("Student email: "+email+"\nPhone Number: "+phoneNumber);
	}
	public static void main(String[] args) {
		
		Students students=new Students();
		students.getStudentInfo(10001);
		students.getStudentInfo(10001, "Pavithra");
		students.getStudentInfo("pavi@gmail.com","9994155559");
		

	}

}
