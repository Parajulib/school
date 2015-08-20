package com.bharat.school.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bharat.school.dao.StudentDao;
import com.bharat.school.domain.Student;
import com.bharat.school.util.ConnectionUtil;

@Repository
public class StudentDaoImpl extends ConnectionUtil implements StudentDao {

		
	@Override
	public void saveStudent(Student student) {
		getSession().saveOrUpdate(student);
	}

	@Override
	public Student getStudentById(int id) {
		return (Student) getSession().get(Student.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAllStudents() {
		return getSession().createQuery("FROM Student").list();
	}

	@Override
	public void deleteStudent(Student student) {
		getSession().delete(student);
	}

}
