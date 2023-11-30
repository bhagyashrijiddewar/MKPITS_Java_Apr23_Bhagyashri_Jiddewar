package com.example.NewSpringBootApplication;

import com.example.NewSpringBootApplication.dao.StudentDAO;
import com.example.NewSpringBootApplication.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NewSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewSpringBootApplication.class, args);
		System.out.println("Hello");
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner->{
			System.out.println("Command Line Runner");
//			createStudent(studentDAO);
//			findStudent(studentDAO);
//			deleteStudentRecord(studentDAO);--------------------------
			updateRecord(studentDAO);
		};
	}
//	------------ Insert the data into database ----------------
	public void createStudent(StudentDAO studentDAO) {
		Student student = new Student("teju", "Mohan Nagar", "Nagpur");
		studentDAO.save(student);
	}
//	----------------- Find the particular element by primary key -----------------------
	public void findStudent(StudentDAO studentDAO){
		Student student=studentDAO.findByRollNo(2);
		System.out.println(student);
	}
//	----------------- Delete particular record by roll number ----------------------
	public void deleteStudentRecord(StudentDAO studentDAO){
		studentDAO.deleteRecord(2);
	}
//	------------------- Update particular record by roll number -------------------
	public void updateRecord(StudentDAO studentDAO){
		Student student=new Student();
		student.setRoll_No(1);
		student.setName_("Nikhil");
		student.setAddress("Manish nagar");
		student.setCity("Nagpur");
		studentDAO.updateRecord(student);
	}
}
