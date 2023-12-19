package com.example.StudentMangement.services;

import com.example.StudentMangement.entity.Address;
import com.example.StudentMangement.entity.Student;

import java.util.List;

public interface StudentService {
//    -------------- Display All student data --------------
    List<Student> findAllStudentList();

    //    ------------------ Display Student by roll no.----------------------
    Student findStudentByRollNO(Integer roll_no);

    //    ------------------ insert student data----------------------
    String insertData(Student student);

//    ------------------ Delete student record-----------------------
    String deleteStudentData(Integer roll_no);

//    ------------------ Display address by address_id----------------------
    Address findStudentByAddressId(Integer address_id);

    //    ------------------ Display Student by address_id----------------------
    Student  findStudentByAddress(Integer address_id);


    //    ------------------ Delete address record and fk_address_id should be stored null -----------------------
    void deleteAddressData(Integer address_id);





}
