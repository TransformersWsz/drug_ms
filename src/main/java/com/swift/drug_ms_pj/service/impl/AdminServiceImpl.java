package com.swift.drug_ms_pj.service.impl;

import com.swift.drug_ms_pj.mapper.AdminMapper;
import com.swift.drug_ms_pj.pojo.Admin;
import com.swift.drug_ms_pj.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> getAllAdmin() {
        return adminMapper.findAll();
    }

    @Override
    public List<Admin> findAdminByNameAndPasswd(String name, String passwd) {
        return adminMapper.selectAdminByNameAndPasswd(name, passwd);
    }
}
