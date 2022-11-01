package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String name = "postgres";
    private static final String password = "1234";

    public static Connection getConnection () throws SQLException {
        return DriverManager.getConnection(URL, name, password);
    }
}
