/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.crs.dao.impl;

import edu.crs.dao.CrudUtill;
import edu.crs.dao.custom.SingupDao;
import edu.crs.entity.SingupEntity;
import java.util.ArrayList;

/**
 *
 * @author MADUSHAN
 */
public class SingupDaoImpl implements SingupDao{

    @Override
    public boolean add(SingupEntity t) throws Exception {
        return CrudUtill.executeUpdate("INSERT INTO User (User_Name,Password,Email,Role) VALUES (?,?,?,?)",
                t.getUsername(),
                t.getPassword(),
                t.getEmail(),
                t.getRole());
    }

    @Override
    public boolean update(SingupEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SingupEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SingupEntity get2(String id, String ps) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<SingupEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
