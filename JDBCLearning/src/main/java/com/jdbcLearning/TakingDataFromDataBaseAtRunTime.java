package com.jdbcLearning;

import java.sql.*;
import java.util.*;

public class TakingDataFromDataBaseAtRunTime {

    public static void printResult(int result){
        if(result==0){
            System.out.println("Record is not Updated");
        }
        else{
            System.out.println("Record is Updated Successfully");
        }
    }

    public static void insertData(Connection con,Scanner sc) throws SQLException {
        //Inserting data
        String insertQuery="INSERT INTO studentInfo(id,StudentName,StudentAge,StudentCity) VALUES(?,?,?,?)";
        PreparedStatement pStatement=con.prepareStatement(insertQuery);

        System.out.print("Enter ID : ");
        int id = Integer.parseInt(sc.nextLine());


        System.out.print("Enter Student Name : ");
        String stName=sc.nextLine();


        System.out.print("Enter Student Age : ");
        int stAge=Integer.parseInt(sc.nextLine());


        System.out.print("Enter Student City : ");
        String stCity=sc.nextLine();

        pStatement.setInt(1,id);
        pStatement.setString(2, stName);
        pStatement.setInt(3,stAge);
        pStatement.setString(4,stCity);

        int result=pStatement.executeUpdate();
        printResult(result);
    }


    public static void updateData(Connection con,Scanner sc) throws SQLException {
        String updateQuery="UPDATE studentInfo SET StudentCity='Delhi' WHERE id=?";
        PreparedStatement pStatement2=con.prepareStatement(updateQuery);

        System.out.print("Enter the id for Update : ");
        int updateId=sc.nextInt();

        pStatement2.setInt(1,updateId);

        int result2=pStatement2.executeUpdate();
        printResult(result2);
    }

    public static void deleteData(Connection con,Scanner sc) throws SQLException {
        String deleteQuery="DELETE FROM studentInfo WHERE id=?";
        PreparedStatement pStatement=con.prepareStatement(deleteQuery);

        System.out.print("Enter the id for Deleting : ");
        int updateId=sc.nextInt();

        pStatement.setInt(1,updateId);

        int result=pStatement.executeUpdate();
        printResult(result);
    }

    public static void displayingData(Connection con,Scanner sc) throws SQLException {
        String displayingQuery="SELECT * FROM studentInfo";
        PreparedStatement pStatement=con.prepareStatement(displayingQuery);

        ResultSet resultSet=pStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(
                    resultSet.getInt(1)+" "+
                    resultSet.getString(2)+" "+
                    resultSet.getInt(3)+" "+
                    resultSet.getString(4)
                    );
        }

    }
    public static void main(String[] args) throws SQLException {

        Scanner sc=new Scanner(System.in);
        Connection con =JdbcUtil.getConnection();

        //Inserting Data
        insertData(con,sc);


        //Updating the data
//        updateData(con,sc);

        //Deleting the data
//        deleteData(con,sc);


        //Displaying data
        displayingData(con,sc);

    }
}
