package com.bharat.school.service;

import java.util.List;

import com.bharat.school.domain.Student;

public interface StudentService {
	public void saveStudent(Student student);
	public Student getStudentById(int id);
	public List<Student> getAllStudents();
	public void deleteStudent(int id);
}
