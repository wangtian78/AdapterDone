package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Student;
import model.StudentCollection;

//
// A unit test for StudentCollection, okay a small start
//
// @author Rick Mercer
//
public class StudentCollectionTest {

  @Test
  public void testGetters() {
    StudentCollection students = new StudentCollection(false);
    assertEquals(0, students.size());
    students.add(new Student("Dakota", "Psychology", 1.999, 22));
    students.add(new Student("Kim", "Computer Science", 2.0, 23));
    assertEquals(2, students.size());
    assertNull(students.getFirstStudentWithName("Not here"));
    assertEquals(1.999, students.getFirstStudentWithName("Dakota").getGPA(), 0.0001);
  }
}
