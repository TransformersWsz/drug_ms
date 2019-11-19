package com.swift.drug_ms_pj.service.impl;

import com.swift.drug_ms_pj.mapper.StorageMapper;
import com.swift.drug_ms_pj.pojo.Storage;
import com.swift.drug_ms_pj.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    @Override
    public List<Storage> getAllStorage() {
        return storageMapper.findAll();
    }

    @Override
    public List<Storage> getPartStorages(Integer limit, Integer offset) {
        return storageMapper.selectPartStorages(limit, offset);
    }

    @Override
    public Integer insertStorageService(String name) {
        return storageMapper.insertStorage(name);
    }
}
