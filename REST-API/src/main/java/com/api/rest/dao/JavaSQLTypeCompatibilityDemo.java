package com.api.rest.dao;

import java.sql.*;

public class JavaSQLTypeCompatibilityDemo {

    private final Connection connection;

    public JavaSQLTypeCompatibilityDemo(Connection connection) {
        this.connection = connection;
    }

    public void createTable() throws SQLException {
        String sql = """
            CREATE TABLE IF NOT EXISTS DataTypeDemo (
                id INT PRIMARY KEY,
                name VARCHAR(50),
                age INTEGER,
                salary DECIMAL(10,2),
                is_active BOOLEAN,
                join_date DATE,
                last_login TIMESTAMP
            )
        """;
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        }
    }

    public void insertRecord(int id, String name, int age, double salary,
                             boolean isActive, java.sql.Date joinDate, java.sql.Timestamp lastLogin)
            throws SQLException {

        String insertSQL = "INSERT INTO DataTypeDemo VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            pstmt.setInt(1, id);              // Java int → SQL INT
            pstmt.setString(2, name);         // Java String → SQL VARCHAR
            pstmt.setInt(3, age);             // Java int → SQL INTEGER
            pstmt.setDouble(4, salary);       // Java double → SQL DECIMAL
            pstmt.setBoolean(5, isActive);    // Java boolean → SQL BOOLEAN
            pstmt.setDate(6, joinDate);       // Java Date → SQL DATE
            pstmt.setTimestamp(7, lastLogin); // Java Timestamp → SQL TIMESTAMP
            pstmt.executeUpdate();
        }
    }

    public ResultSet fetchAll() throws SQLException {
        Statement stmt = connection.createStatement();
        return stmt.executeQuery("SELECT * FROM DataTypeDemo");
    }
}
