/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.crs.dto;

/**
 *
 * @author MADUSHAN
 */
public class StudentRegiserDto {
    
    private String name;
    private String dob;
    private String programe;
    private String year;
    private Integer contact;

    public StudentRegiserDto() {
    }

    public StudentRegiserDto(String name, String dob, String programe, String year, Integer contact) {
        this.name = name;
        this.dob = dob;
        this.programe = programe;
        this.year = year;
        this.contact = contact;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the programe
     */
    public String getPrograme() {
        return programe;
    }

    /**
     * @param programe the programe to set
     */
    public void setPrograme(String programe) {
        this.programe = programe;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the contact
     */
    public Integer getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(Integer contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "StudentRegiserDto{" + "name=" + name + ", dob=" + dob + ", programe=" + programe + ", year=" + year + ", contact=" + contact + '}';
    }
    
    
    
}
