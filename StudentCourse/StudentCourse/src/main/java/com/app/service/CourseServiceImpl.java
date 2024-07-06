package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Repository.CourseRepository;
import com.app.entity.Course;
@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseReposito;
	
	@Override
	public Course addCourseDetails(Course course) {		
		return courseReposito.save(course);
	}

}
