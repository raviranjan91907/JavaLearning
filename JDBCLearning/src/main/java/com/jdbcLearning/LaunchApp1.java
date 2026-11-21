package com.jdbcLearning;

import java.sql.*;
public class LaunchApp1 {
    public static void main(String[] args) throws ClassNotFoundException{

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("class loaded");

    }
}
