package com.jpaexample.student_db;

import com.jpaexample.student_db.entity.Mark;
import com.jpaexample.student_db.entity.Student;
import com.jpaexample.student_db.entity.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentDbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentDbApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	public void run(String... args) throws Exception{
		Student s1 = new Student(7889,"test1","test");
		Student s2 = new Student(234,"tes2","test2");
		Mark jv = new Mark(60,"java");
		Mark math = new Mark(67,"math");
		Mark english = new Mark(90,"english");

		s1.getMark().add(jv);
		s1.getMark().add(math);
		s1.getMark().add(english);

		this.studentRepository.save(s1);
		this.studentRepository.save(s2);

	}

}
