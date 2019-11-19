package com.swift.drug_ms_pj.service;

import com.swift.drug_ms_pj.pojo.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> getAllPatient();

    List<Patient> getPartPatients(Integer limit, Integer offset);

    Integer changeDrugNum(String drug_id, Integer drug_num);

    Integer insertPatientService(String name, String state, String drug_id, Integer drug_num, String purchase_date);
}
