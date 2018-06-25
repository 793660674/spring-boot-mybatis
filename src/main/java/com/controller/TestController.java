package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mapper.CountInfoMapper;
import com.model.CountInfo;
import com.model.CountInfoExample;
import com.model.CountInfoExample.Criteria;

@Controller
@RequestMapping("/count")
public class TestController extends BaseController {
	@Autowired
	private CountInfoMapper countInfoMapper;

	// 拓展班级 新增接口
	@ResponseBody
	@RequestMapping(value = "/select")
	public Object select() {
		CountInfoExample example = new CountInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andYearBetween(0, 9999);
		example.setOrderByClause("username asc,email desc");
		List<CountInfo> list = countInfoMapper.selectByExample(example);
		return renderSuccess(list);
	}

}
