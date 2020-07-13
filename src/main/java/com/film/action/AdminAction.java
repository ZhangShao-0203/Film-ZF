package com.film.action;

import com.film.pojo.Admin;
import com.film.service.IAdminService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminAction extends ActionSupport implements ModelDriven<Admin> {

    private IAdminService adminService;
    Admin admin;

    @Override
    public Admin getModel() {
        return admin;
    }
}
