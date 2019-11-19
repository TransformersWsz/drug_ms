package com.swift.drug_ms_pj.mapper;

import com.swift.drug_ms_pj.pojo.Drug;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DrugMapper {

    @Select("select * from drug")
    List<Drug> findAll();

    @Select("select * from drug limit #{offset}, #{limit}")
    List<Drug> selectPartDrugs(@Param("limit") Integer limit, @Param("offset") Integer offset);



    @Insert("insert into drug(id, name, expiry_date, price, production_date, num, firm, storage_id) values(#{id}, #{name}, #{expiry_date}, #{price}, #{production_date}, #{num}, #{firm}, #{storage_id})")
    Integer insertDrug(@Param("id") String id, @Param("name") String name, @Param("expiry_date") String expiry_date, @Param("price") Float price, @Param("production_date") String production_date, @Param("num") Integer num, @Param("firm") String firm, @Param("storage_id") Integer storage_id);

}
