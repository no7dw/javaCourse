package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodemoApplicationTests {
	@Autowired
	private AccountDAO accountDAO;

	@Test
	public void contextLoads() {
	}
	@Test
	public void find(){
		Account account = accountDAO.findByName("Wade");
		System.out.println(JSONObject.toJSONString(account));
	}
}
