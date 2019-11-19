package com.swift.drug_ms_pj.service;

import com.swift.drug_ms_pj.pojo.Admin;

import java.util.List;

public interface AdminService {

    List<Admin> getAllAdmin();

    List<Admin> findAdminByNameAndPasswd(String name, String passwd);
}
