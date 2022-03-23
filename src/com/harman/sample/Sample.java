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
            String name,roll,adm,coll;
            System.out.println("Enter the name");
            name = input.next();
            System.out.println("Enter the roll number");
            roll = input.next();
            System.out.println("Enter the admission number");
            adm = input.next();
            System.out.println("Enter the college name");
            coll = input.next();
            Statement stmt = c.createStatement();
            stmt.executeUpdate("INSERT INTO `student`( `name`, `rollno`, `admno`, `college`) " +
                    "VALUES('"+name+"',"+roll+","+adm+",'"+coll+"')");
            System.out.println("Inserted Successfully");

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}