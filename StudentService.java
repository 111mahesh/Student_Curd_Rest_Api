package com.tech.sb_rest_practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tech.sb_rest_practice.model.Student;
import com.tech.sb_rest_practice.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentRepository sr;
	
	public Student insertStudent(Student s)
	{
		return sr.save(s);
	}
	public Student findBySid(int sid)
	{
		return sr.findBySid(sid);
	}
	public List<Student> findAllStudent()
	{
		return sr.findAll();
	}
	public int deletestudent(int sid)
	{
		return sr.deleteBySid(sid);
	}
}
