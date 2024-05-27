import java.util.Comparator;

//Class representing a Student
public class Student {
	int rollno;  // Field to store student's roll number
	String name; // Field to store student's name 
	String address;  // Field to store student's address
	
	// Constructor to init new Student objects
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	// Override the toString() method to provide a string representation of the Student object
	@Override
	public String toString() {
		return "Rollno: " + rollno + ", Name: " + name + ", Address: " + address;
	}
	
	// Nested class to compare students by name
	public static class NameComparator implements Comparator<Student> {
		// Method to compare two Student objects by name
	    @Override
	    public int compare(Student s1, Student s2) {
	        return s1.name.compareTo(s2.name);  // Compare names using String's compareTo method
	    }
	}
	
	// Nested class to compare students by roll number
	public static class RollnoComparator implements Comparator<Student> {
		// Method to compare two Student objects by roll number
		@Override
	    public int compare(Student s1, Student s2) {
	        return Integer.compare(s1.rollno, s2.rollno);  // Compare roll numbers using Integer's compare method
	    }
	}
	
	
}
