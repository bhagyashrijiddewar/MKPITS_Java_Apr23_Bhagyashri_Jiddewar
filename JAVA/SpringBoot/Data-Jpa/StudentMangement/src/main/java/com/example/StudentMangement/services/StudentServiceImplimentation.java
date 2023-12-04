package com.example.StudentMangement.services;

import com.example.StudentMangement.dao.StudentDao;
import com.example.StudentMangement.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplimentation implements StudentService{
    private StudentDao studentDao;

    @Autowired
    public StudentServiceImplimentation(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    @Override
    public List<Student> findAllStudentList() {
        return studentDao.findAll();
    }

    @Override
    public Student findStudent(Integer roll_no) {
       Optional optional= studentDao.findById(roll_no);
      Student student=(Student)optional.get();
        return student;
    }

    @Override
    @Transactional
    public String insertData(Student student) {
           studentDao.save(student);
           return "Insert Record.";
    }

//    @Override
//    @Transactional
//    public Student updateRecord(Student student,Integer roll_no) {
//      Student student1=studentDao.findById(roll_no).get();
////       Student student=optional.get();
//        System.out.println(student1);
//       studentDao.save(student);
//       System.out.println("Update successfully.");
//       return student;
//    }
        @Override
        @Transactional
        public String updateRecord(Student student) {
            Optional<Student> optional=studentDao.findById(student.getRoll_No());
        if(optional.isPresent()){
            studentDao.save(student);
            return "Update";
        } else {
            return "Not update";
        }
     }
    @Override
    @Transactional
    public String deleteStudentRecord(Integer roll_no) {
        Optional optional=studentDao.findById(roll_no);
        Student student=(Student)optional.get();
         studentDao.delete(student);
        return "Delete record.";
    }
}
