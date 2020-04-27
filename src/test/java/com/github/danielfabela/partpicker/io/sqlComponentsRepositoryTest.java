package com.github.danielfabela.partpicker.io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

public class sqlComponentsRepositoryTest {
    Connection testConnection;

    @Before
    public void preSetup() {
        try {
            this.testConnection = DriverManager.getConnection(
                    "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;INIT=runscript from 'classpath:/schema.sql'", "", "");
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    @Test
    public void insertAllIntegrationTest() {
        
    }
}