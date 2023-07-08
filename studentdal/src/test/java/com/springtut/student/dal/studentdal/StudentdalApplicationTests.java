package com.springtut.student.dal.studentdal;

import com.springtut.student.dal.studentdal.Repository.StudentRepository;
import com.springtut.student.dal.studentdal.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	@Test
	void testCreateStudent() {
		Student student = new Student();
		student.setName("Sanjeev");
		student.setCourse("Spring boot");
		student.setFees(Double.valueOf(5000));
		studentRepository.save(student);
	}

	@Test
	void testFindStudentById(){
		Student student = studentRepository.findById(1).get();
		System.out.println(student);
	}

	@Test
	void testDeleteStudent(){
		studentRepository.delete(studentRepository.findById(1).get());
	}

}
