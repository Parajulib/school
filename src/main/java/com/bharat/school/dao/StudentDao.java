package com.bharat.school.dao;
import java.util.List;
import com.bharat.school.domain.Student;

public interface StudentDao {
	public void saveStudent(Student student);
	public Student getStudentById(int id);
	public List<Student> getAllStudents();
	public void deleteStudent(Student student);
}
