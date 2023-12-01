package com.example.CrudOperationUsingJPA.services;

import com.example.CrudOperationUsingJPA.dao.StudentDao;
import com.example.CrudOperationUsingJPA.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplimentation implements StudentService{
    private StudentDao studentDao;
   @Autowired
    public StudentServiceImplimentation(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    @Override
    @Transactional
    public String insertData(Student student) {
        return studentDao.insertData(student);
    }
    @Override
    @Transactional
    public Student updateRecord(Student student) {
        return studentDao.updateRecord(student);
    }
    @Override
    @Transactional
    public String deleteStudentRecord(Integer roll_no) {
        return studentDao.deleteStudentRecord(roll_no);
    }
}
