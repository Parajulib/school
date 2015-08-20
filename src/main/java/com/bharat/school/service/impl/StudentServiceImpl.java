package com.bharat.school.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bharat.school.dao.StudentDao;
import com.bharat.school.domain.Student;
import com.bharat.school.service.StudentService;


@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	
	@Override
	public void saveStudent(Student student) {
		
		studentDao.saveStudent(student);
		
	}

	@Override
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

	@Override
	public void deleteStudent(int id) {
		Student student = getStudentById(id);
		if(student != null)
			studentDao.deleteStudent(student);
	}

}
