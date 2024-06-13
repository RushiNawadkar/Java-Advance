package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Student;
import com.app.service.StudentSerive;


@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentSerive studentService;
	
	public StudentController() {
		System.out.println("in the Student controller"+getClass());
	}
	
	@PostMapping
	public Student adddStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
		
	}
}
