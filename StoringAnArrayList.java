import java.util.ArrayList;  

public class StoringAnArrayList {
	public static void main(String[] args) {
		// Create ArrayList to store Student objects
		ArrayList<Student> students = new ArrayList<>();
		
		// Add 10 Student objects to the ArrayList
		students.add(new Student(3, "Dylan", "657 Any Street"));
		students.add(new Student(6, "Cole", "751 Any Street"));
		students.add(new Student(1, "Chris", "981 Any Street"));
		students.add(new Student(4, "Logan", "128 Any Street"));
		students.add(new Student(9, "Manuel", "597 Any Street"));
		students.add(new Student(5, "Aliciana", "651 Any Street"));
		students.add(new Student(2, "Aik", "459 Any Street"));
		students.add(new Student(10, "Kyle", "349 Any Street"));
		students.add(new Student(7, "Steven", "254 Any Street"));
		students.add(new Student(8, "Jeremy", "964 Any Street"));
	
		// Print the original list of Students
		System.out.println("Original List:");
		for (Student s : students) {
			System.out.println(s); // Print each Student object in the list
		}

		// Sort the list by name using the recursive selection sort method and print the sorted list
		System.out.println("\nSorted by Name:");
		SelectionSort.selectionSortRecursive(students, new Student.NameComparator(), 0); // Call the recursive selection sort by name method
		for (Student s : students) {
			System.out.println(s); // Print each Student object in the sorted list
		}

		// Sort the list by roll number using the recursive selection sort method and print the sorted list
		System.out.println("\nSorted by Roll Number:");
		SelectionSort.selectionSortRecursive(students, new Student.RollnoComparator(), 0); // Call the recursive selection sort by roll number method
		for (Student s : students) {
        System.out.println(s); // Print each Student object in the sorted list
		}
	}
}