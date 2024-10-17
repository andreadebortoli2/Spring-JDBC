package com.dba.SpringJDBC.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dba.SpringJDBC.model.Student;

@Repository
public class StudentRepository {

    public void save(Student s) {
        System.out.println("Student added");
    }

    public List<Student> findAll() {

        List<Student> students = new ArrayList<>();

        return students;
    }

}