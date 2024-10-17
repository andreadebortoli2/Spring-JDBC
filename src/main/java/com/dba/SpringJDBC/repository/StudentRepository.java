package com.dba.SpringJDBC.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dba.SpringJDBC.model.Student;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {

        String query = "INSERT INTO Students (id, name, marks) VALUES (?, ?, ?)";

        int rows = jdbc.update(query, s.getId(), s.getName(), s.getMarks());

        if (rows == 1)
            System.out.println("Student added");
        else
            System.out.println("database error adding student");
    }

    public List<Student> findAll() {

        List<Student> students = new ArrayList<>();

        return students;
    }

}