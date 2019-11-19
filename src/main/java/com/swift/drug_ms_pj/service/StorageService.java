package com.swift.drug_ms_pj.service;

import com.swift.drug_ms_pj.pojo.Storage;

import java.util.List;

public interface StorageService {

    List<Storage> getAllStorage();

    List<Storage> getPartStorages(Integer limit, Integer offset);

    Integer insertStorageService(String name);

}
