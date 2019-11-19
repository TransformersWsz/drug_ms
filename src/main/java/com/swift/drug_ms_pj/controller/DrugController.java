package com.swift.drug_ms_pj.controller;

import com.swift.drug_ms_pj.pojo.Drug;
import com.swift.drug_ms_pj.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class DrugController {

    @Autowired
    private DrugService drugService;

    // [分页]查询药品
    @GetMapping("/drug")
    @ResponseBody
    public HashMap<String, Object> getDrugs(Integer limit, Integer offset) {
        List<Drug> drugs = drugService.getPartDrugs(limit, offset);
        int total = drugService.getAllDrug().size();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("total", total);
        hashMap.put("rows", drugs);
        return hashMap;
    }

    // 添加药品
    @PostMapping("/drug")
    @ResponseBody
    public HashMap<String, Integer> addDrug(String id, String name, String expiry_date, Float price, String production_date, Integer num, String firm, Integer storage_id) {
        HashMap<String, Integer> hashMap = new HashMap();
        Integer res = drugService.insertDrugService(id, name, expiry_date, price, production_date, num, firm, storage_id);
        hashMap.put("drug_id", res);
        return hashMap;
    }
}
