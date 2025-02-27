/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.crs.service.custom.impl;

import edu.crs.dao.DaoFactory;
import edu.crs.dao.custom.StudentRegiserDao;
import edu.crs.dto.StudentRegiserDto;
import edu.crs.entity.StudentRegiserEntity;
import edu.crs.service.custom.StudentRegiserService;

/**
 *
 * @author MADUSHAN
 */
public class StudentRegiserServiceImpl implements StudentRegiserService {

    private StudentRegiserDao studentRegiserDao = (StudentRegiserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.STUDNET);

    @Override
    public String saveStudent(StudentRegiserDto studentRegiserDto) throws Exception {
        
        StudentRegiserEntity studentRegiserEntity = new StudentRegiserEntity(studentRegiserDto.getName(),
                studentRegiserDto.getDob(),studentRegiserDto.getPrograme(),studentRegiserDto.getYear(),studentRegiserDto.getContact()
        );
        
        if (studentRegiserDao.add(studentRegiserEntity)) {
            return "Registertion Successful";
        } else {
            return "Registertion fail";
        }
    }

}
