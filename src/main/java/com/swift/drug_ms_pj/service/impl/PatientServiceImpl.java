package com.swift.drug_ms_pj.service.impl;

import com.swift.drug_ms_pj.mapper.PatientMapper;
import com.swift.drug_ms_pj.pojo.Patient;
import com.swift.drug_ms_pj.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientMapper patientMapper;

    @Override
    public List<Patient> getAllPatient() {
        return patientMapper.findAll();
    }

    @Override
    public List<Patient> getPartPatients(Integer limit, Integer offset) {
        return patientMapper.selectPartPatients(limit, offset);
    }

    @Override
    public Integer changeDrugNum(String drug_id, Integer drug_num) {
        return patientMapper.updateDrugNum(drug_id, drug_num);
    }

    @Override
    public Integer insertPatientService(String name,  String state, String drug_id, Integer drug_num, String purchase_date) {
        return patientMapper.insertPatient(name, state, drug_id, drug_num, purchase_date);
    }
}
