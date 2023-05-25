package com.tech.sb_rest_practice.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.sb_rest_practice.model.Student;
import com.tech.sb_rest_practice.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService ss;
	
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student s)
	{
		return ss.insertStudent(s);
	}
	
	@GetMapping("/findbyid/{id}")
	public Student findStudent(@PathVariable("id")int id)
	{
		return ss.findBySid(id);
	}
	@GetMapping("/findAll")
	public List<Student> findAllStudent()
	{
		return ss.findAllStudent();
	}
	@DeleteMapping("/deletebyid/{id}")
	public int deleteStudent(@PathVariable("id")int id)
	{
		return ss.deletestudent(id);
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student s)
	{
		return ss.insertStudent(s);
	}
}
