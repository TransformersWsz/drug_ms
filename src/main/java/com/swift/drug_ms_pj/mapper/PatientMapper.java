package com.swift.drug_ms_pj.mapper;

import com.swift.drug_ms_pj.pojo.Patient;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PatientMapper {

    @Select("select * from patient")
    List<Patient> findAll();

    @Select("select * from patient limit #{offset}, #{limit}")
    List<Patient> selectPartPatients(@Param("limit") Integer limit, @Param("offset") Integer offset);

    @Update("update drug set num = num - #{drug_num} where id = #{drug_id}")
    Integer updateDrugNum(@Param("drug_id") String drug_id, @Param("drug_num") Integer drug_num);

    @Insert("insert into patient(name, state, drug_id, drug_num, purchase_date) values(#{name}, #{state}, #{drug_id}, #{drug_num}, #{purchase_date})")
    Integer insertPatient(@Param("name") String name, @Param("state") String state, @Param("drug_id") String drug_id, @Param("drug_num") Integer drug_num, @Param("purchase_date") String purchase_date);
}
