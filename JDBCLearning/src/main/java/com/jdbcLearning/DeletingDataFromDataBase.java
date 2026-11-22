package com.jdbcLearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletingDataFromDataBase {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        //Loading and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");


        //Establish the connection
        String url="jdbc:mysql://localhost:3306/jdbcLearning";
        String root="root";
        String password="Rajku@1357";
        Connection connect= DriverManager.getConnection(url,root,password);


        Statement statement=connect.createStatement();

        //Executing the Query
        String sqlQuery="DELETE FROM studentInfo WHERE id=1";
        int rowsAffected=statement.executeUpdate(sqlQuery);

        if(rowsAffected==0){
            System.out.println("Record not Deleted");
        }
        else{
            System.out.println("Record Deleted Successfully");
        }

        statement.close();
        connect.close();
    }
}
