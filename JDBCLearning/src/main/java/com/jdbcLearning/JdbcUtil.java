package com.jdbcLearning;

import java.sql.*;
public class JdbcUtil {
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection() throws SQLException {
        String url="jdbc:mysql://localhost:3306/jdbcLearning";
        String root="root";
        String password="Rajku@1357";

        return DriverManager.getConnection(url,root,password);
    }

    public static void closeResource(Connection con,Statement st) throws SQLException {
        con.close();
        st.close();
    }
}
