package com.sw.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sw.dao.MemberDao;
import com.sw.dto.MemberDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MemberDaoTest {
	@Autowired
	MemberDao mDao;

	@Test
	public void testgetMerberEmailByIdx() throws Exception{
		int idx = 4;
		System.out.println("Email : " + mDao.getMemberEmail(idx));
	}
	@Test
	public void testgetMemerPwByEmail() throws Exception{
		String email = "developer@naver.com";
		System.out.println("Pw : " + mDao.getMemberPw(email));
	}

	@Test
	public void testGetMemberInfo() throws Exception{
		MemberDto dto = mDao.getMemberInfo(new MemberDto(0,"developer@naver.com", "tkddnsrh1!", null));

		System.out.println(dto.getEmail());
		System.out.println(dto.getPw());
		System.out.println(dto.getNick_name());
		System.out.println(dto.getIdx());
	}
}
