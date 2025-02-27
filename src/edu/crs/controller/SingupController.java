/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.crs.controller;

import edu.crs.dto.SingupDto;
import edu.crs.service.ServiceFactory;
import edu.crs.service.custom.SingupService;

/**
 *
 * @author MADUSHAN
 */
public class SingupController {
     
    private SingupService singupService = (SingupService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.SINGUP);
    public String save(SingupDto singupDto) throws Exception{
        return singupService.save(singupDto);
       
    }
    
}
