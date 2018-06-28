package com.example.demo.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.CountInfoMapper;
import com.example.demo.model.CountInfo;
import com.example.demo.model.CountInfoExample;
import com.example.demo.service.Test;

@Service("test")
public class TestImpl implements Test {
	@Autowired
	private CountInfoMapper countInfoMapper;

	@Override
	public List<CountInfo> getasd(CountInfoExample example) {
		// TODO Auto-generated method stub
		return countInfoMapper.selectByExample(example);
	}
}
