package com.cmpay.service.chinapay.service.impl;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmpay.service.chinapay.dao.TestUserMapper;
import com.cmpay.service.chinapay.model.TestUser;
import com.cmpay.service.chinapay.service.DemoService;


/**
 * @author gengkangkang
 * @E-mail gengkangkang@cm-inv.com
 *
 * 2016年9月1日 上午10:33:26
 *
 */
@Service
public class DemoServiceImpl implements DemoService {

	private Logger logger=Logger.getLogger(this.getClass());
	@Autowired
	private TestUserMapper testUserMapper;

	@Override
	public void test(TestUser record) {
		testUserMapper.insert(record);

	}


}
