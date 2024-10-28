package com.fyxify.practice.dao;

import com.fyxify.practice.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);

    Student findById(Long id);

    List<Student> findAll();

    List<Student> findByName(String name);

    void update(Student student);

    void delete(Long id);
}
