package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Course;
import com.app.service.CourseService;



@RestController
@RequestMapping("/courses")//uri
public class CourseController {
	
	@Autowired
	private CourseService addcourse;
	
	public CourseController() {
		System.out.println("in the course controller"+getClass());
	}
	
	@PostMapping
	public Course regCourse(@RequestBody Course course ) {
		return addcourse.addCourseDetails(course);
	}
}
