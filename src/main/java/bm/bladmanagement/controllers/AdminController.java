package bm.bladmanagement.controllers;

import bm.bladmanagement.services.IAdminService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    private IAdminService adminService;

    public AdminController(IAdminService adminService){
        this.adminService = adminService;
    }
}
