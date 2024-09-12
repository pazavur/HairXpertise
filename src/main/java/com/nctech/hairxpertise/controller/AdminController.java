package com.nctech.hairxpertise.controller;
import com.nctech.hairxpertise.dtos.AdminDTO;
import com.nctech.hairxpertise.services.AdminServices;
import com.nctech.hairxpertise.servicesimpl.AdminServicesImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salon/admin/")
public class AdminController{



    AdminServices adminServices = new AdminServicesImpl();

    @RequestMapping("save")
    public void save(@RequestBody AdminDTO admin){
        adminServices.save(admin);
    }

    @RequestMapping("findbyid/{id}")
    public AdminDTO findById(@PathVariable  long id){
        return adminServices.findById(id);
    }

    @RequestMapping("findall")
    public List<AdminDTO> findAll(){
        return  adminServices.findAll();
    }

    @RequestMapping("update")
    public void update (AdminDTO admin){
        adminServices.update(admin);
    }

    @RequestMapping("delete")
    public void delete (long id){
        adminServices.delete(id);
    }




}

