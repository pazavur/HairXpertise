package com.nctech.hairxpertise.dtos;

import lombok.Data;

/**
 * A Data Transfer Object (DTO) representing a salon.
 */
@Data
public class SalonDTO {

    /**
     * The unique identifier of the salon.
     */
    private Integer id;

    /**
     * The name of the salon.
     */
    private String saloonName;

    /**
     * The administrator associated with the salon.
     */
    private AdminDTO admin;

    /**
     * The number of employees in the salon.
     */
    private Integer empNo;

    /**
     * The contact number of the salon.
     */
    private String contact;

    /**
     * The email address of the salon.
     */
    private String email;

    /**
     * The physical address of the salon.
     */
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSaloonName() {
        return saloonName;
    }

    public void setSaloonName(String saloonName) {
        this.saloonName = saloonName;
    }

    public AdminDTO getAdmin() {
        return admin;
    }

    public void setAdmin(AdminDTO admin) {
        this.admin = admin;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
