package bm.bladmanagement.services;

import bm.bladmanagement.models.Admin;
import bm.bladmanagement.repositories.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
@Service
public class AdminService implements IAdminService{

    private AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Set<Admin> findAll() {
        return null;
    }

    @Override
    public Admin save(Admin object) {
        return null;
    }

    @Override
    public void delete(Admin object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Admin> findById(Long aLong) {
        return Optional.empty();
    }
}
