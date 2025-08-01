package maps;

import java.util.Objects;

public class Student {
	
	private String studentNumber;
	private String studentName;
	
	// Constructor
	public Student(String studentNumber, String studentName) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
	}
	
	// Getter and Setters	

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public int hashCode() {
		return (studentName + studentNumber).hashCode();
	}

	
	public static class HashFunctions{
		
		// h1
		public static int h1(Object key) {
			return key.hashCode();
		}
		
		//h2
		public static int h2(int hashCode, int N) {
			return hashCode % N;
		}
	}
	
	
	// create student object
	public static void main(String[] args) {
		Student student = new Student("123456", "Fatima");
		
		int hashCode = HashFunctions.h1(student);
		int hashValue = HashFunctions.h2(hashCode, 109);
		
		// Print
		System.out.println("Student: " + student.getStudentName() + "," + student.getStudentNumber());
		System.out.println("Hash Code (h1): " + hashCode);
		System.out.println("Hash value (h2, N=109): " + hashValue);
		
	}

}
