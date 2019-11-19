package com.swift.drug_ms_pj.controller;

import com.swift.drug_ms_pj.pojo.Storage;
import com.swift.drug_ms_pj.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class StorageController {

    @Autowired
    private StorageService storageService;

    // [分页]查询库房
    @GetMapping("/storage")
    @ResponseBody
    public List<Storage> getDrugs(Integer limit, Integer offset) {
        List<Storage> storages = null;
        if (limit == null || offset == null) {
            storages = storageService.getAllStorage();
        }
        else {
            storages = storageService.getPartStorages(limit, offset);
        }
        return storages;
    }

    // 添加库房
    @PostMapping("/storage")
    @ResponseBody
    public HashMap<String, Integer> addStorage(String name) {
        HashMap<String, Integer> hashMap = new HashMap();
        Integer storage_id = storageService.insertStorageService(name);
        hashMap.put("storage_id", storage_id);
        return hashMap;
    }
}
