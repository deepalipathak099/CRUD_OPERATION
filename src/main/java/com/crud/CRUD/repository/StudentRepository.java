package com.crud.CRUD.repository;

import com.crud.CRUD.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findStudentByStudentName(String studentName);
    @Modifying
    @Transactional
    @Query("update Student s set s.studentAddress=:address where s.id=:id")
    void updateById(@Param("id") int id, @Param("address") String address);
}
