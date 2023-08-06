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
}
