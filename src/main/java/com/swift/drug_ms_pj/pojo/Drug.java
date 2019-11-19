package com.swift.drug_ms_pj.pojo;

import java.sql.Date;

public class Drug {
    private String id;
    private String name;
    private Date expiry_date;
    private Float price;
    private Date production_date;
    private Integer num;
    private String firm;
    private Integer storage_id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getProduction_date() {
        return production_date;
    }

    public void setProduction_date(Date production_date) {
        this.production_date = production_date;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public Integer getStorage_id() {
        return storage_id;
    }

    public void setStorage_id(Integer storage_id) {
        this.storage_id = storage_id;
    }
}
