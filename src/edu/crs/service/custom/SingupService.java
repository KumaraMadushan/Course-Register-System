/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.crs.service.custom;

import edu.crs.dto.SingupDto;
import edu.crs.service.SuperService;

/**
 *
 * @author MADUSHAN
 */
public interface SingupService extends SuperService{
    
    String save(SingupDto singupDto)throws Exception;
    
}
