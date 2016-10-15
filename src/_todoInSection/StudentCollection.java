package _todoInSection;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import model.Student;

/**
 * StudentCollection is a collection class that keeps track of all our students.
 * 
 * @author Jorge Vergara, Rick Mercer, and Jeremy Mowery (jermowery@email.arizona.edu)
 *    
 */
// TODO 1: Adapt this class to a TableModel with the methods JTable needs.
// You can Google the methods or let Eclipse write the method stubs for you
// (after adding implements TableModel to the class heading).
//
// Note: Some TableModel methods need not be implemented.
public class StudentCollection implements TableModel {

  private List<Student> theStudents;

  /**
   * The constructor for a StudentCollection. Initializes the list of
   * students.
   */
  public StudentCollection() {
    theStudents = new ArrayList<Student>();
    setUpDefaultList();
  }

  /**
   * Initializes the list with a few hard-coded students
   */
  private void setUpDefaultList() {
    theStudents.add(new Student("Kim", "Computer Science", 4.0, 23));
    theStudents.add(new Student("Chris", "Computer Science", 4.0, 23));
    theStudents.add(new Student("Devon", "Math", 2.7, 21));
    theStudents.add(new Student("Ashley", "Biology", 3.29, 27));
    theStudents.add(new Student("Taylor", "Economics", 3.9, 25));
    theStudents.add(new Student("Chris", "Economics", 3.8, 19));
    theStudents.add(new Student("Dakota", "Psychology", 1.99, 22));
  }
 
  public int size() {
    return theStudents.size();
  }

  public void add(Student newStudent) {
    theStudents.add(newStudent);
  }

  public Student get(int index) {
    return theStudents.get(index);
  }

  public Student getFirstStudentWithName(String name) {
    for (int index = 0; index < size(); index++) {
      if (name.equals(theStudents.get(index).getName()))
        return theStudents.get(index);
    }
    return null; // not found
  }

@Override
public void addTableModelListener(TableModelListener arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public Class<?> getColumnClass(int col) {
	if (col==0||col==1)
		return String.class;
	if (col==2)
		return Double.class;
	if (col==3)
		return int.class;
	return null;
}

@Override
public int getColumnCount() {
	// TODO Auto-generated method stub
	return 4;
}

@Override
public String getColumnName(int col) {
	if (col==0)
		return "Name";
	if (col==1)
		return "Major";
	if (col==2)
		return "GPA";
	if (col==3)
		return "Age";
	return null;
}

@Override
public int getRowCount() {
	// TODO Auto-generated method stub
	return theStudents.size();
}

@Override
public Object getValueAt(int row, int col) {
	Student temp = theStudents.get(row);
	if (col==0)
		return temp.getName();
	if (col==1)
		return temp.getMajor();
	if (col==2)
		return temp.getGPA();
	if (col==3)
		return temp.getAge();
	return null;
}

@Override
public boolean isCellEditable(int arg0, int arg1) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void removeTableModelListener(TableModelListener arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void setValueAt(Object arg0, int arg1, int arg2) {
	// TODO Auto-generated method stub
	
}

}
