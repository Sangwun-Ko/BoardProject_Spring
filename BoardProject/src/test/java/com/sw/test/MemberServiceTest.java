package com.sw.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sw.service.MemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MemberServiceTest {
	@Autowired
	MemberService mSvc;
	@Test
	public void testCheckLogin() throws Exception{
		String email = "developer@naver.com";
		String pw = "tkddnsrh1!";
		System.out.println(mSvc.checkLogin(email, pw));
	}
}
