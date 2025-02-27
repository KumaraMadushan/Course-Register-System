/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.crs.dao.impl;

import edu.crs.dao.CrudUtill;
import edu.crs.dao.custom.StudentRegiserDao;
import edu.crs.entity.StudentRegiserEntity;
import java.util.ArrayList;

/**
 *
 * @author MADUSHAN
 */
public class StudentRegiserDaoImpl implements StudentRegiserDao{

    @Override
    public boolean add(StudentRegiserEntity t) throws Exception {
       return CrudUtill.executeUpdate("INSERT INTO Students (Full_Name,Dob,Program,Enroll_Year,Contact) VALUES (?,?,?,?,?)",
               t.getName(),
               t.getDob(),
               t.getPrograme(),
               t.getYear(),
               t.getContact());
    }

    @Override
    public boolean update(StudentRegiserEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public StudentRegiserEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public StudentRegiserEntity get2(String id, String ps) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<StudentRegiserEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
