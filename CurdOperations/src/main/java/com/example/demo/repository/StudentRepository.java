package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Modifying(clearAutomatically = true)
	@Query(value = "delete from Student where rollNo=?1")
	public int deleteStudent(int r);

}
