package model;

import java.util.ArrayList;
import java.util.List;

/**
 * StudentCollection is a collection class that keeps track of all our students.
 * 
 * @author Jorge Vergara, Rick Mercer, and Jeremy Mowery (jermowery@email.arizona.edu)
 * 
 */
// TODO 1: Adapt this class to a TableModel with the methods JTable needs
// You should do this by creating a new class in the _todoInSection package, do
// not implement TableModel here as it will introduce view components to your
// model and make it difficult to test some parts of your code.
// Note: Many methods need not be implemented in the class that you write to
public class StudentCollection {

	private List<Student> theStudents;

	/**
	 * The constructor for a StudentCollection. Initializes the list of
	 * students.
	 */
	public StudentCollection(boolean startWith9Students) {
		theStudents = new ArrayList<Student>();
		if (startWith9Students)
			setUpDefaultList();
	}

	/**
	 * Initializes the list with a few hard-coded students
	 */
	private void setUpDefaultList() {
		theStudents.add(new Student("Kim", "Computer Science", 4.0, 23));
		theStudents.add(new Student("Chris", "Computer Science", 4.0, 23));
		theStudents.add(new Student("Devon", "Math", 2.7, 21));
		theStudents.add(new Student("Chris", "Math", 3.7, 20));
		theStudents.add(new Student("Ashley", "Biology", 3.29, 27));
		theStudents.add(new Student("Taylor", "Economics", 3.9, 25));
		theStudents.add(new Student("Chris", "Economics", 3.8, 19));
		theStudents.add(new Student("Dakota", "Psychology", 1.99, 22));
		theStudents.add(new Student("Kim", "Computer Science", 2.0, 23));
	}

	public int size() {
		return theStudents.size();
	}

	public void add(Student newStudent) {
		theStudents.add(newStudent);
	}

	public void get(int index) {
		this.theStudents.get(index);
	}

	public Student getFirstStudentWithName(String name) {
		for (int index = 0; index < size(); index++) {
			if (name.equals(theStudents.get(index).getName()))
				return theStudents.get(index);
		}
		return null; // not found
	}
}
