package org.student;

import org.department.Department;

public class Student extends Department{

	void studentName() {
		System.out.println("Pavithra");
	}
	void studentDept() {
		System.out.println("IT department");
	}
	void studentID() {
		System.out.println("1001");
	}
	public static void main(String[] args) {
		Student student=new Student();
		student.studentName();
		student.studentID();
		student.studentDept();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();

	}

}
