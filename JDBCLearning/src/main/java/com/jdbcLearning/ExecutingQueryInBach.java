package com.jdbcLearning;

import java.sql.*;
import java.util.*;

/*
In Java JDBC, addBatch() is used to add multiple SQL statements to a batch (a collection of SQL commands) so that you can execute them together using executeBatch().

Instead of executing every SQL statement individually, you can add them to a batch and execute them in one go.

How does it work?
addBatch()

    Add SQL statements
    INSERT INTO student VALUES(1, 'Ravi')
    INSERT INTO student VALUES(2, 'Aman')
    INSERT INTO student VALUES(3, 'Rahul')

                     |
                     |
                     V
                executeBatch()
        Execute the queued statements
                     |
                     |
                     V
                MySQL Database
            Statements executed


    Important interview point
    Why do we use batch processing in JDBC?
    - Reduces the number of database communication round trips.
    - Can improve performance when executing multiple SQL statements.
    - Makes it convenient to execute multiple insert, update, or delete operations together.

    Remember this simple concept:
    - addBatch() → Collect SQL queries.
    - executeBatch() → Execute collected SQL queries.
    - clearBatch() → Clear collected SQL queries.
    One more thing: addBatch() does not execute the SQL query immediately. It only adds it to the batch.
 */
public class ExecutingQueryInBach {
    public static void printResult(int result){
        if(result==0){
            System.out.println("Record is not Updated");
        }
        else{
            System.out.println("Record is Updated Successfully");
        }
    }

    public static PreparedStatement insertData(Connection con, Scanner sc,PreparedStatement pStatement) throws SQLException {
        //Inserting data

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

        System.out.println();
        return pStatement;
    }


    public static PreparedStatement updateData(Connection con,Scanner sc) throws SQLException {
        String updateQuery="UPDATE studentInfo SET StudentCity='Delhi' WHERE id=?";
        PreparedStatement pStatement=con.prepareStatement(updateQuery);

        System.out.print("Enter the id for Update : ");
        int updateId=sc.nextInt();

        pStatement.setInt(1,updateId);

        return pStatement;
    }

    public static PreparedStatement deleteData(Connection con,Scanner sc) throws SQLException {
        String deleteQuery="DELETE FROM studentInfo WHERE id=?";
        PreparedStatement pStatement=con.prepareStatement(deleteQuery);

        System.out.print("Enter the id for Deleting : ");
        int updateId=sc.nextInt();

        pStatement.setInt(1,updateId);

        return pStatement;
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

        String insertQuery="INSERT INTO studentInfo(id,StudentName,StudentAge,StudentCity) VALUES(?,?,?,?)";
        PreparedStatement pStatement=con.prepareStatement(insertQuery);

        PreparedStatement person1= insertData(con,sc,pStatement);
        pStatement.addBatch();

        PreparedStatement person2=insertData(con,sc,pStatement);
        pStatement.addBatch();

        PreparedStatement person3=insertData(con,sc,pStatement);
        pStatement.addBatch();


        int[] result=pStatement.executeBatch();

        for(int i=0;i<result.length;i++){
            printResult(result[i]);
        }


    }
}
