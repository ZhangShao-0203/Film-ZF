package com.film.action;

import com.film.pojo.Admin;
import com.film.service.IAdminService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import lombok.Data;

@Data
public class AdminAction extends ActionSupport implements ModelDriven<Admin> {

    private IAdminService adminService;
    Admin admin;

    @Override
    public Admin getModel() {
        return admin;
    }
    public String add() {
        try {
            int i = adminService.add(admin);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "list";
    }
}
