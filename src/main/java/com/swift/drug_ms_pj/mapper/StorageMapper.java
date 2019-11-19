package com.swift.drug_ms_pj.mapper;

import com.swift.drug_ms_pj.pojo.Storage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StorageMapper {

    @Select("select * from storage")
    List<Storage> findAll();

    @Select("select * from storage limit #{offset}, #{limit}")
    List<Storage> selectPartStorages(@Param("limit") Integer limit, @Param("offset") Integer offset);

    @Insert("insert into storage(name) values(#{name})")
    Integer insertStorage(@Param("name") String name);
}
