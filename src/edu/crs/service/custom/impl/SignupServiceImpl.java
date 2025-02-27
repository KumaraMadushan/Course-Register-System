/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.crs.service.custom.impl;

import edu.crs.dao.DaoFactory;
import edu.crs.dao.custom.SingupDao;
import edu.crs.dto.SingupDto;
import edu.crs.entity.SingupEntity;
import edu.crs.service.custom.SingupService;

/**
 *
 * @author MADUSHAN
 */
public class SignupServiceImpl implements SingupService{
    
    private SingupDao sinupDao = (SingupDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.SINGUP);
    @Override
    public String save(SingupDto singupDto) throws Exception {
        
        SingupEntity singupEntity = new SingupEntity(singupDto.getUsername(),
        singupDto.getPassword(),singupDto.getEmail(),singupDto.getRole());
        
        if(sinupDao.add(singupEntity)){
            return "Singup Successful";
        }else{
            return "Singup fail";
        }
        
    }
    
}
