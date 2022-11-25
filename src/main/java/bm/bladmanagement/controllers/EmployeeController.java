package bm.bladmanagement.controllers;

import bm.bladmanagement.services.IEmployeeService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private IEmployeeService employeeService;

    public EmployeeController(IEmployeeService employeeService){
        this.employeeService = employeeService;
    }
}
