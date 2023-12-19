package com.example.StudentMangement.rest;

import com.example.StudentMangement.entity.Address;
import com.example.StudentMangement.entity.Student;
import com.example.StudentMangement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AddressRest {
    private StudentService studentService;

    @Autowired
    public AddressRest(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/students/address/{address_id}")
    public Address findStudentByAddressId(@PathVariable Integer address_id){
        return studentService.findStudentByAddressId(address_id);
    }
    @GetMapping("/student/{address_id}")
    public Student findStudentByAddress(@PathVariable Integer address_id){
       return studentService.findStudentByAddress(address_id);
    }
    @DeleteMapping("/address/{address_id}")
    public Student deleteAddressData(@PathVariable Integer address_id) {
      Address address=  findStudentByAddress(address_id).getAddress();
        Student student=address.getStudent();
        student.setAddress(null);
        studentService.deleteAddressData(address_id);
       return student;
    }
}
