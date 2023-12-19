package com.example.StudentMangement.services;

import com.example.StudentMangement.entity.Address;
import com.example.StudentMangement.repo.StudentDao;
import com.example.StudentMangement.entity.Student;
import com.example.StudentMangement.repo.StudentRepoAddress;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplimentation implements StudentService{
    private StudentDao studentDao;
    private StudentRepoAddress studentRepoAddress;

    @Autowired
    public StudentServiceImplimentation(StudentDao studentDao, StudentRepoAddress studentRepoAddress) {
        this.studentDao = studentDao;
        this.studentRepoAddress = studentRepoAddress;
    }

    @Override
    public List<Student> findAllStudentList() {
        return studentDao.findAll();
    }

    @Override
    public Address findStudentByAddressId(Integer address_id) {
       Optional<Address> optional= studentRepoAddress.findById(address_id);
      return optional.get();
    }

    @Override
    public Student findStudentByAddress(Integer address_id) {
        Address address=studentRepoAddress.findById(address_id).get();
       Student student= address.getStudent();
        return student;
    }

    @Override
    @Transactional
    public void deleteAddressData(Integer address_id) {
        studentRepoAddress.deleteById(address_id);
    }

    //
    @Override
    public Student findStudentByRollNO(Integer roll_no ){
       Optional<Student> optional= studentDao.findById(roll_no);
        return optional.get();
    }
//
    @Override
    @Transactional
    public String insertData(Student student) {
           studentDao.save(student);
           return "Insert Record.";
    }

    @Override
    @Transactional
    public String deleteStudentData(Integer roll_no){
        studentDao.deleteById(roll_no);
        return "Record deleted";
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
//        @Override
//        @Transactional
//        public String updateRecord(Student student) {
//            Optional<Student> optional=studentDao.findById(student.getRoll_No());
//        if(optional.isPresent()){
//            studentDao.save(student);
//            return "Update";
//        } else {
//            return "Not update";
//        }
//     }
//    @Override
//    @Transactional
//    public String deleteStudentRecord(Integer roll_no) {
//        Optional optional=studentDao.findById(roll_no);
//        Student student=(Student)optional.get();
//         studentDao.delete(student);
//        return "Delete record.";
//    }
}
