package com.crud.CRUD.service;

import com.crud.CRUD.model.Student;

import java.util.List;

public interface IStudentService {
    Student saveStudentDetails(Student student);
    List<Student> getStudentDetailsByName(String studentName);
    Student updateStudentAddressById(int id, String studentAddress);
    Student deleteStudentDetailsById(int id);


}
