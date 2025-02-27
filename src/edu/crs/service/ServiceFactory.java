/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.crs.service;

import edu.crs.service.custom.impl.SignupServiceImpl;
import edu.crs.service.custom.impl.StudentRegiserServiceImpl;

/**
 *
 * @author MADUSHAN
 */
public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public SuperService getService(ServiceType serviceType) {

        switch (serviceType) {
            case SINGUP:
                return new SignupServiceImpl();
            case STUDENT:
                return new StudentRegiserServiceImpl();
            default:
                throw null;
        }

    }

    public enum ServiceType {
        SINGUP, STUDENT
    }

}
