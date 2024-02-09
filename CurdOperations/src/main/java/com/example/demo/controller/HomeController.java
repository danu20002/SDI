package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

import jakarta.transaction.Transactional;

@RestController
@Transactional
public class HomeController {
	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("/")
	public String index() {
		return "Welcome to spring boot curdOperation";
	}

	@PostMapping("/saveStudent")
	public Student saveData(@RequestBody Student student) {
		studentRepository.save(student);

		return student;
	}

	@GetMapping("/getAllStudent")
	public List<Student> getAll() {
		List<Student> studentList = studentRepository.findAll();
		return studentList;
	}

	@DeleteMapping("/deleteStudent/{rollNo}")
	public Integer deleteStudent(@PathVariable int rollNo) {
		Student student = studentRepository.findById(rollNo).get();
		System.err.println("[deleteStudent] student roll no: " + student.getRollNo());
		try {
			if (student != null) {
				studentRepository.deleteStudent(rollNo);
				return studentRepository.deleteStudent(rollNo);
			} else
				return 0;
		} catch (Exception e) {
			return -1;
		}
	}

	@PutMapping("/updataStudent")
	public String updateStudent(@RequestBody Student student) {

		if (student != null) {
			studentRepository.save(student);
			return "Student Update";
		}

		else
			return "Not exit";
	}

}
