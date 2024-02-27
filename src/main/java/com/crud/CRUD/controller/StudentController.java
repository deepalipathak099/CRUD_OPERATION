package com.crud.CRUD.controller;

import com.crud.CRUD.model.Student;
import com.crud.CRUD.service.IStudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    IStudentService studentService;
    @PostMapping("/save")
public ResponseEntity<Student> saveStudentDetails(@RequestBody @Valid Student student){
        Student student1=studentService.saveStudentDetails(student);
        return new ResponseEntity<>(student1, HttpStatus.CREATED);

    }
    @GetMapping("/searchbyname")
    public ResponseEntity<List<Student>> searchStudentByStudentName(@RequestParam String studentName){
        List<Student> studentList=studentService.getStudentDetailsByName(studentName);
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
    @PutMapping("/updateaddress")
    public ResponseEntity<Student> updateStudentAddressById(@RequestParam String studentAddress, @RequestParam int id){
        Student student=studentService.updateStudentAddressById(id,studentAddress);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Student> deleteStudentDetailsById(@RequestParam int id){
        Student student=studentService.deleteStudentDetailsById(id);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }
}
