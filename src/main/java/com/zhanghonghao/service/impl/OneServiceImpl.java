package com.zhanghonghao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhanghonghao.bean.One;
import com.zhanghonghao.dao.OneMapper;
import com.zhanghonghao.service.OneService;
@Service
public class OneServiceImpl implements OneService {

	@Resource
	OneMapper oneMapper ;

	@Override
	public List<One> selectOne() {
		
		return oneMapper.selectOne();
	}
	
	
}
