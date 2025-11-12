package com.api.rest.dao;

import org.junit.jupiter.api.*;
import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

public class JavaSQLTypeCompatibilityDemoTest {

    private static Connection connection;
    private static JavaSQLTypeCompatibilityDemo demo;

    @BeforeAll
    static void setupDatabase() throws SQLException {
        connection = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1", "sa", "");
        demo = new JavaSQLTypeCompatibilityDemo(connection);
        demo.createTable();
    }

    @Test
    @DisplayName("Test Java and SQL Data Type Compatibility")
    void testInsertAndRetrieveData() throws SQLException {
        int id = 1;
        String name = "Alice";
        int age = 30;
        double salary = 85000.50;
        boolean isActive = true;
        java.sql.Date joinDate = java.sql.Date.valueOf("2022-01-15");
        java.sql.Timestamp lastLogin = new java.sql.Timestamp(System.currentTimeMillis());

        // Insert data (Java → SQL)
        demo.insertRecord(id, name, age, salary, isActive, joinDate, lastLogin);

        // Retrieve data (SQL → Java)
        ResultSet rs = demo.fetchAll();
        assertTrue(rs.next(), "ResultSet should contain data");

        assertEquals(id, rs.getInt("id"));
        assertEquals(name, rs.getString("name"));
        assertEquals(age, rs.getInt("age"));
        assertEquals(salary, rs.getDouble("salary"), 0.001);
        assertEquals(isActive, rs.getBoolean("is_active"));
        assertEquals(joinDate, rs.getDate("join_date"));
        assertNotNull(rs.getTimestamp("last_login"));

        rs.close();
    }

    @AfterAll
    static void closeConnection() throws SQLException {
        connection.close();
    }
}
