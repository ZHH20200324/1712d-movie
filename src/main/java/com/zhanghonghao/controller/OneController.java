package com.zhanghonghao.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhanghonghao.bean.One;
import com.zhanghonghao.service.OneService;

@Controller
public class OneController {

	@Resource
	OneService oneService;
	@RequestMapping("index")
	public String selectOne(ModelAndView model) {
		List<One> list = oneService.selectOne();
		System.out.println(list);
		model.addObject(list);
		return "index";
	}
}
