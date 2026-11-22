package com.jdbcLearning;

import java.sql.*;
public class UpdatingInDataBase {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/jdbcLearning";
        String root="root";
        String password="Rajku@1357";
        Connection con=DriverManager.getConnection(url,root,password);

        Statement st=con.createStatement();

        String updateStatement="UPDATE studentInfo set Studentage=24 where id=1";

        int result=st.executeUpdate(updateStatement);

        if(result==0){
            System.out.println("Record Not Updated");
        }
        else{
            System.out.println("Record updated");
        }
    }
}
