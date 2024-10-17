package com.dba.SpringJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dba.SpringJDBC.model.Student;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringJdbcApplication.class, args);

		Student student = ctx.getBean(Student.class);
		student.setId(101);
		student.setName("John Doe");
		student.setMarks(78);
	}

}