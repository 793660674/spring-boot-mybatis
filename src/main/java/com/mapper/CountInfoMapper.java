package com.mapper;

import com.model.CountInfo;
import com.model.CountInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountInfoMapper {
    long countByExample(CountInfoExample example);

    int deleteByExample(CountInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CountInfo record);

    int insertSelective(CountInfo record);

    List<CountInfo> selectByExample(CountInfoExample example);

    CountInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CountInfo record, @Param("example") CountInfoExample example);

    int updateByExample(@Param("record") CountInfo record, @Param("example") CountInfoExample example);

    int updateByPrimaryKeySelective(CountInfo record);

    int updateByPrimaryKey(CountInfo record);
}