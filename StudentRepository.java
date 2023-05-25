package com.tech.sb_rest_practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.sb_rest_practice.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	Student findBySid(int sid);
	int deleteBySid(int sid);
}
