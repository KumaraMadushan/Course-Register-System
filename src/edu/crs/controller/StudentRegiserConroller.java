/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.crs.controller;

import edu.crs.dto.StudentRegiserDto;
import edu.crs.service.ServiceFactory;
import edu.crs.service.custom.StudentRegiserService;

/**
 *
 * @author MADUSHAN
 */
public class StudentRegiserConroller {

    private StudentRegiserService studentRegiserService = (StudentRegiserService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.STUDENT);

    public String save(StudentRegiserDto studentRegiserDto) throws Exception {
        return studentRegiserService.saveStudent(studentRegiserDto);

    }

}
