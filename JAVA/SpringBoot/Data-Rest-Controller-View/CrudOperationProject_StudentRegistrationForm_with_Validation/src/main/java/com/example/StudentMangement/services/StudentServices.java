package com.example.StudentMangement.services;

import com.example.StudentMangement.entity.Student;
import com.example.StudentMangement.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class StudentServices implements StudentServiceInterface {
    private StudentRepository studentRepository;

    @Autowired
    public StudentServices(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public List<Student> findAllStudentData() {
        return studentRepository.findAll();
    }

    @Override
    @Transactional
    public String insertStudentData(Student student) {
         studentRepository.save(student);
         return "Insert data successfully.";
    }
}
