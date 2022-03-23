package com.harman.sample;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        try{
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/company?autoReconnect=true&useSSL=false","root","");
            Scanner input = new Scanner(System.in);
            String code,name,designation,no;
            System.out.println("Enter the code");
            code = input.next();
            System.out.println("Enter the name");
            name = input.next();
            System.out.println("Enter the designation");
            designation = input.next();

            System.out.println("Enter the no");
            no = input.next();

            Statement stmt = c.createStatement();
            stmt.executeUpdate("INSERT INTO `employee`( `code`, `name`, `designation`, `no`)" +
                    "VALUES("+code+",'"+name+"','"+designation+"',"+no+")");
                    System.out.println("Inserted Successfully");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
