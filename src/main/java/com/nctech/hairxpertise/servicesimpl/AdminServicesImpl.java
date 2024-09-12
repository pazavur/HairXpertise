package com.nctech.hairxpertise.servicesimpl;

import com.nctech.hairxpertise.dtos.AdminDTO;
import com.nctech.hairxpertise.repository.AdminRepository;
import com.nctech.hairxpertise.services.AdminServices;
import java.util.List;

public class AdminServicesImpl implements AdminServices {
    AdminRepository adminRepository = new AdminRepository();

    @Override
    public void save(AdminDTO admin) {

        adminRepository.save(admin);
    }

    @Override
    public AdminDTO findById(long id) {

        for (AdminDTO admin : adminRepository.get()) {
            if (admin.getId() == id) {
                return admin;
            }
        }
        return null;
    }

    @Override
    public List<AdminDTO> findAll() {
        return adminRepository.get();
    }

    @Override
    public void update(AdminDTO admin) {
        AdminDTO tempadmin = findById(admin.getId());
        tempadmin.setName(admin.getName());
        tempadmin.setAge(admin.getAge());
        tempadmin.setAddress(admin.getAddress());
        tempadmin.setAxperianceInYear(admin.getAxperianceInYear());


    }

    @Override
    public void delete(long id) {
        AdminDTO adminDTO = findById(id);
        adminRepository.get().remove(adminDTO);

    }
}
