package com.harman.sample;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        try{
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/college?autoReconnect=true&useSSL=false","root","");
            Scanner input = new Scanner(System.in);
        String name,rollno,admno,college;
        System.out.println("Enter the name");
        name = input.next();
        System.out.println("Enter the roll number");
        rollno = input.next();
        System.out.println("Enter the admission number");
        admno = input.next();
        System.out.println("Enter the college name");
        college = input.next();
            Statement stmt = c.createStatement();
            stmt.executeUpdate("INSERT INTO `student`( `name`, `rollno`, `admno`, `college`) " +
                    "VALUES('"+name+"',"+rollno+","+admno+",'"+college+"')");
            System.out.println("Inserted Successfully");

    }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
//create java pgm to read employee data from user and store it to the database company empcode,empname,designation,salary,mob no