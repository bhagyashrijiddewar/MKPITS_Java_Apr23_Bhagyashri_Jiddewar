package com.example.StudentMangement.rest;

import com.example.StudentMangement.entity.Student;
import com.example.StudentMangement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRest {
    private StudentService studentService;

    @Autowired
    public StudentRest(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> displayStudentList(){
        return studentService.findAllStudentList();
    }
//    @GetMapping("/students/{roll_no}")
//    public Student displayStudent(@PathVariable Integer roll_no){
//        return studentService.findStudent(roll_no);
//    }
    @PostMapping("/students")
    public String insertStudentRecord(@RequestBody Student student){
        return studentService.insertData(student);
    }
// // @PutMapping("/students/{roll_no}")
// // public Student updateStudentRecord(@RequestBody Student student, @PathVariable Integer roll_no){
// //      return studentService.updateRecord(student,roll_no);
// //   }
//    @PutMapping("/students")
//    public String updateStudentRecord(@RequestBody Student student){
//    return studentService.updateRecord(student);
//}
//    @DeleteMapping("/students/{roll_no}")
//    public String deleteStudentRecord(@RequestBody @PathVariable Integer roll_no){
//        return studentService.deleteStudentRecord(roll_no);
//    }
//
//    @ExceptionHandler
//    public ResponseEntity<ErrorDetails> NoRecordFound(NoRecordFoundException noRecordFoundException){
//        ErrorDetails errorDetails=new ErrorDetails();
//        errorDetails.setStatus(HttpStatus.NOT_FOUND.value());
//        errorDetails.setMessage(noRecordFoundException.getMessage());
//        errorDetails.setTimestamp(System.currentTimeMillis());
//        return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.NOT_FOUND);
//    }
}
