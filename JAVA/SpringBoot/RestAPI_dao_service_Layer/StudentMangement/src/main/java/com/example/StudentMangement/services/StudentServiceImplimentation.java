package com.example.StudentMangement.services;

import com.example.StudentMangement.dao.StudentDao;
import com.example.StudentMangement.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImplimentation implements StudentService{
    private StudentDao studentDao;

    @Autowired
    public StudentServiceImplimentation(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    @Override
    public List<Student> findAllStudentList() {
        return studentDao.findAllRecordsOfStudent();
    }

    @Override
    public Student findStudent(Integer roll_no) {
        return studentDao.findStudent(roll_no);
    }

    @Override
    @Transactional
    public String insertData(Student student) {
        return  studentDao.insertData(student);
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
