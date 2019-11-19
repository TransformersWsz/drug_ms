package com.swift.drug_ms_pj.service;

import com.swift.drug_ms_pj.pojo.Drug;

import java.util.List;

public interface DrugService {

    List<Drug> getAllDrug();

    List<Drug> getPartDrugs(Integer limit, Integer offset);

    Integer insertDrugService(String id, String name, String expiry_date, Float price, String  production_date, Integer num, String firm, Integer storage_id);
}
