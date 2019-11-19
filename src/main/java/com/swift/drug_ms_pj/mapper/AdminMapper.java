package com.swift.drug_ms_pj.mapper;

import com.swift.drug_ms_pj.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdminMapper {

    @Select("select * from admin")
    List<Admin> findAll();

    @Select("select * from admin where name = #{name} and passwd = #{passwd}")
    List<Admin> selectAdminByNameAndPasswd(@Param("name") String name, @Param("passwd") String passwd);

}
