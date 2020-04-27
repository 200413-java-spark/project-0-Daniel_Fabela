package com.github.danielfabela.partpicker.io;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sqlDataSource {
    private static sqlDataSource instance;
    private String url;
    private String user;
    private String password;

    private sqlDataSource() {
        url = System.getProperty("database.url", "jdbc:postgresql://localhost:5432/pclist");
        user = System.getProperty("database.username", "pclist");
        password = System.getProperty("database.password", "pclist");
    }

    public static sqlDataSource getInstance() {
        if (instance == null) {
            instance = new sqlDataSource();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}