package com.spring.learn.test.dao;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@SuppressWarnings("restriction")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SpringDemo {
	@Resource(name="customerDAOProxy")
	private UserDao userDao;
	@Test
	public void test(){
		userDao.add();
		System.out.println(">>>>>>>>>>>>>>");
	}
}
