package com.nctech.hairxpertise.services;

import com.nctech.hairxpertise.dtos.AdminDTO;

import java.util.List;

public interface AdminServices {
    // all are abstrac method
    public void save(AdminDTO admin);
    public AdminDTO findById(long id);
    public List<AdminDTO> findAll();
    public void update (AdminDTO admin);
    public void delete (long id);


        

}
