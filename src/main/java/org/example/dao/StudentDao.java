package org.example.dao;

import org.example.entity.Student;

public interface StudentDao {
    void createTable();

    void saveStudent(Student student);

    void updateStudent(Student student,Integer id);



}
