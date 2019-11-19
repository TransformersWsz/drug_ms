package com.swift.drug_ms_pj.pojo;

import java.sql.Date;

public class Patient {
    private Integer id;
    private String name;
    private String state;
    private String drug_id;
    private Integer drug_num;
    private Date purchase_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDrug_id() {
        return drug_id;
    }

    public void setDrug_id(String drug_id) {
        this.drug_id = drug_id;
    }

    public Integer getDrug_num() {
        return drug_num;
    }

    public void setDrug_num(Integer drug_num) {
        this.drug_num = drug_num;
    }

    public Date getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(Date purchase_date) {
        this.purchase_date = purchase_date;
    }
}
