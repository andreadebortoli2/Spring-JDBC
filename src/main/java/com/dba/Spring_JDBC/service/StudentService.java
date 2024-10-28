package com.dba.Spring_JDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dba.Spring_JDBC.model.Student;
import com.dba.Spring_JDBC.repository.StudentRepository;

@Service
public class StudentService {

    private StudentRepository repo;

    public StudentRepository getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepository repo) {
        this.repo = repo;
    }

    public void addStudent(Student s) {
        repo.save(s);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
