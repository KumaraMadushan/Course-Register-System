/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.crs.service.custom;

import edu.crs.dto.StudentRegiserDto;
import edu.crs.service.SuperService;

/**
 *
 * @author MADUSHAN
 */
public interface StudentRegiserService extends SuperService {

    String saveStudent(StudentRegiserDto studentRegiserDto) throws Exception;

}
