/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.crs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MADUSHAN
 */
public class DBConnection {
    
    private static DBConnection dbconnection;
    private Connection connection;
    
    public DBConnection() throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseregistation","root","1234");
    }
    
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        if(dbconnection == null){
            dbconnection = new DBConnection();
        }
        return dbconnection;
    }
    
    public Connection getConnection(){
        return connection;
    }
}
