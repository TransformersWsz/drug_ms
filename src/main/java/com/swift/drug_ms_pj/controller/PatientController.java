package com.swift.drug_ms_pj.controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.swift.drug_ms_pj.pojo.Patient;
import com.swift.drug_ms_pj.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PatientController {

    @Autowired
    private PatientService patientService;


    public String getPreCallbackTime(String preCallbackTimeStart){
        if (!preCallbackTimeStart.contains("T")){
            return preCallbackTimeStart;
        }
        String TimeStart = preCallbackTimeStart.replace("Z", " UTC");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        String preCallbackTime = "";
        try {
            String callbackTimeStart = format.parse(TimeStart).toString();
            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US);
            TimeZone tz = TimeZone.getTimeZone("GMT+8");
            sdf.setTimeZone(tz);
            Date parse = sdf.parse(callbackTimeStart);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            preCallbackTime = simpleDateFormat.format(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return preCallbackTime;
    }

    // [分页]查询购药记录
    @GetMapping("/patient")
    @ResponseBody
    public HashMap<String, Object> getPatients(Integer limit, Integer offset) {
        List<Patient> patients = patientService.getPartPatients(limit, offset);
        int total = patientService.getAllPatient().size();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("total", total);
        hashMap.put("rows", patients);
        return hashMap;
    }

    // 添加购药记录
    @PostMapping("/patient")
    @ResponseBody
    public HashMap<String, Integer> addPatient(String name, String state, String drug_id, Integer drug_num, String purchase_date) {
        HashMap<String, Integer> hashMap = new HashMap();
        Integer id = patientService.insertPatientService(name, state, drug_id, drug_num, purchase_date);
        patientService.changeDrugNum(drug_id, drug_num);
        hashMap.put("result", id);
        return hashMap;
    }
}
