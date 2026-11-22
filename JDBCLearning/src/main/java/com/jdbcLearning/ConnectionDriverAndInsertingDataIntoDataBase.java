package com.jdbcLearning;

import java.sql.*;
public class ConnectionDriverAndInsertingDataIntoDataBase {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{


        //Loading and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
//        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); this also a way that u can load a driver
        System.out.println("class loaded");


        //Establish the connection
        String url="jdbc:mysql://localhost:3306/jdbcLearning";
        String root="root";
        String password="Rajku@1357";
        Connection connect=DriverManager.getConnection(url,root,password);


        Statement statement=connect.createStatement();

        //Executing the Query
        String sqlQuery="INSERT INTO studentInfo(id,StudentName,StudentAge,StudentCity) VALUES(1,'Rohan',17,'Bengaluru')";
        int rowsAffected=statement.executeUpdate(sqlQuery);

        if(rowsAffected==0){
            System.out.println("Unable to insert the data");
        }
        else{
            System.out.println("inserted Successfully");
        }

        statement.close();
        connect.close();

        System.out.println("The connection is establish");
    }
}
