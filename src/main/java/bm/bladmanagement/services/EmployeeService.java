package bm.bladmanagement.services;

import bm.bladmanagement.models.Employee;
import bm.bladmanagement.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
@Service
public class EmployeeService implements IEmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Set<Employee> findAll() {
        return null;
    }

    @Override
    public Employee save(Employee object) {
        return null;
    }

    @Override
    public void delete(Employee object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Employee> findById(Long aLong) {
        return Optional.empty();
    }
}
