package com.swift.drug_ms_pj.service.impl;

import com.swift.drug_ms_pj.mapper.DrugMapper;
import com.swift.drug_ms_pj.pojo.Drug;
import com.swift.drug_ms_pj.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugServiceImpl implements DrugService {

    @Autowired
    private DrugMapper drugMapper;

    @Override
    public List<Drug> getAllDrug() {
        return drugMapper.findAll();
    }

    @Override
    public List<Drug> getPartDrugs(Integer limit, Integer offset) {
        return drugMapper.selectPartDrugs(limit, offset);
    }


    @Override
    public Integer insertDrugService(String id, String name, String expiry_date, Float price, String production_date, Integer num, String firm, Integer storage_id) {
        return drugMapper.insertDrug(id, name, expiry_date, price, production_date, num, firm, storage_id);
    }
}
