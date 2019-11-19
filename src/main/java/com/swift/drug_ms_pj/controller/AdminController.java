package com.swift.drug_ms_pj.controller;

import com.swift.drug_ms_pj.pojo.Admin;
import com.swift.drug_ms_pj.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/test")
    @ResponseBody
    public List<Admin> test() {
        return adminService.getAllAdmin();
    }

    @PostMapping("/session")
    @ResponseBody
    public HashMap<String, Integer> login(Admin admin) {
        HashMap<String, Integer> hashMap = new HashMap();

        List<Admin> admins = adminService.findAdminByNameAndPasswd(admin.getName(), admin.getPasswd());
        if (admins.size() == 1) {
            hashMap.put("result", 1);
        }
        else {
            hashMap.put("result", 0);
        }
        return hashMap;
    }

    @GetMapping("/index.html")
    public String index() {
        return "index";
    }

    @GetMapping("/record.html")
    public String record() {
        return "record";
    }

    @GetMapping("/login.html")
    public String login() {
        return "login";
    }
}
