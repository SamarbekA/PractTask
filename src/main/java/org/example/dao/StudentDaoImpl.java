package org.example.dao;

import org.example.config.DBConfig;
import org.example.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentDaoImpl implements StudentDao{


    public void createTable() {
        String query = "create table if not exists students(id serial primary key," +
                " name varchar(20) not null, last_name varchar(25) not null, age integer not null)";
        try(Connection connection = DBConfig.getConnection()){
            Statement statement = connection.createStatement();
            statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveStudent(Student student) {
        String query = "INSERT INTO students(name, last_name, age)" +
                "VALUES (?, ?, ?)";

        try(Connection connection = DBConfig.getConnection()){
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,student.getName());
            statement.setString(2,student.getLastName());
            statement.setInt(3,student.getAge());
            statement.executeQuery();
        }catch (SQLException e) {
            System.out.println(e.getMessage());       }

    }

    public void updateStudent(Student student,Integer id) {
        String query = "UPDATE students s SET name= ?,last_name = ?,age = ? where s.id =?";

        try(Connection connection = DBConfig.getConnection()){
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,student.getName());
            statement.setString(2,student.getLastName());
            statement.setInt(3,student.getAge());
            statement.setInt(4,id);
            statement.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());        }

    }
}
