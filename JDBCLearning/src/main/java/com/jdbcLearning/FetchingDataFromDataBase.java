package com.jdbcLearning;

import java.sql.*;
public class FetchingDataFromDataBase {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/jdbcLearning";
        String root="root";
        String password="Rajku@1357";
        Connection con=DriverManager.getConnection(url,root,password);

        Statement st=con.createStatement();

        //Retrieving data form DataBase
        String retrievingQuery="SELECT * FROM studentInfo";


        ResultSet resultSet=st.executeQuery(retrievingQuery);

        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
                    resultSet.getInt(3)+" "+resultSet.getString(4));
        }

        con.close();
        st.close();
        resultSet.close();

    }
}
