package com.nctech.hairxpertise.repository;


import com.nctech.hairxpertise.DB.AdminDB;
import com.nctech.hairxpertise.dtos.AdminDTO;


import java.util.List;

public class AdminRepository {
    public void save(AdminDTO admin){
        admin.setId(AdminDB.admins.size()+1);
        AdminDB.admins.add(admin);
    }
    public List<AdminDTO> get (){
        return AdminDB.admins;
    }


}
