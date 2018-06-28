package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.mapper.CountInfoMapper;
import com.example.demo.model.CountInfo;
import com.example.demo.model.CountInfoExample;
import com.example.demo.model.CountInfoExample.Criteria;
import com.example.demo.service.Test;


@Controller
@RequestMapping("/count")
public class TestController extends BaseController {
	@Autowired
	private Test test;

	// 拓展班级 新增接口
	@ResponseBody
	@RequestMapping(value = "/select")
	public Object select() {
		CountInfoExample example = new CountInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andYearBetween(0, 9999);
		example.setOrderByClause("username asc,email desc");
		List<CountInfo> list = test.getasd(example);
		return renderSuccess(list);
	}

}
