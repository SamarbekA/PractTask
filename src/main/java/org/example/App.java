package org.example;

import org.example.dao.StudentDao;
import org.example.dao.StudentDaoImpl;
import org.example.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        StudentDaoImpl studentDao = new StudentDaoImpl();
//        studentDao.createTable();
//        studentDao.saveStudent(new Student("Samarbek", "Ashym uulu",40));
        studentDao.updateStudent(new Student("Michael", "Jackson", 50),1);


    }
}
