package com.sw.test;


import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sw.dao.DiaryCommentDao;
import com.sw.dto.DiaryCommentDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DiaryCommentDaoTest {
	@Autowired
	DiaryCommentDao dDao;
	@Test
	public void testUpdateDiaryComment() throws Exception{
		int cno = 271;
		String cmt = "UPDATE~~11";
		Date date = new Date(1,1,1);
		dDao.updateDiaryComment(new DiaryCommentDto(cno,0,0,cmt,date));
	}
	
	@Test
	public void testDeleteDiaryComment() throws Exception {
		int cno = 193;
		dDao.delDiaryComment(cno);
	}
}
