package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Repository.CourseRepository;
import com.app.Repository.StudentRepository;
import com.app.entity.Course;
import com.app.entity.Student;
@Service
@Transactional
public class StudentServiceImpl implements StudentSerive {
	@Autowired
	private StudentRepository studentrepository;
	@Autowired
	private CourseRepository courseRepository;
	@Override
	public Student addStudent(Student student) {
		Course newCourse=student.getCid();
		if(newCourse!=null) {
			courseRepository.save(newCourse);
			student.setCid(newCourse);
		}
		return studentrepository.save(student);
	}

}
