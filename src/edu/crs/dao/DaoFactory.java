/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.crs.dao;

import edu.crs.dao.impl.SingupDaoImpl;
import edu.crs.dao.impl.StudentRegiserDaoImpl;

/**
 *
 * @author MADUSHAN
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {

        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;

    }

    public SuperDao getDao(DaoType type) {

        switch (type) {
            case SINGUP:
                return new SingupDaoImpl();
            case STUDNET:
                return new StudentRegiserDaoImpl();
            default:
                throw null;
        }

    }

    public enum DaoType {
        SINGUP, STUDNET
    }

}
