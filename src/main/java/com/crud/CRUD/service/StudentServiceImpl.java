package com.crud.CRUD.service;

import com.crud.CRUD.model.Student;
import com.crud.CRUD.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentServiceImpl implements IStudentService {
@Autowired
    StudentRepository studentRepository;
    @Override
    public Student saveStudentDetails(Student student) {
        Student student1 = new Student();
        try{
            student1=studentRepository.save(student);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return student1;
    }

    @Override
    public List<Student> getStudentDetailsByName(String studentName) {
      List<Student> studentList= new ArrayList<>();
      try{
          studentList=studentRepository.findStudentByStudentName(studentName);

      }
      catch (Exception e){
          e.printStackTrace();
      }
      return studentList;
    }

    @Override
    public Student updateStudentAddressById(int id, String studentAddress) {
        Student student=new Student();
        try{
          studentRepository.updateById(id,studentAddress);
          student=studentRepository.findById(id).get();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return student;
    }

    @Override
    public Student deleteStudentDetailsById(int id) {
       Student student=new Student();
       try{
           student=studentRepository.findById(id).get();
           studentRepository.deleteById(id);
       }
       catch (Exception e){
           e.printStackTrace();
       }
       return student;
    }
}
