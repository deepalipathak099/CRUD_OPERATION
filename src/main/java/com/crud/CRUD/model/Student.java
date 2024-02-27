package com.crud.CRUD.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "student_details")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name="student_name")
    String studentName;
    @Column(name="student_address")
    String studentAddress;
    @Column(name="student_roll_number")
    int studentRollNumber;
    @Column(name="student_mobile_number")
    String studentMobileNumber;
    @Column(name="student_email_id")
    String studentEmailId;

}
