package com.sw.test;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sw.dao.DiaryCommentDao;
import com.sw.dto.DiaryCommentDto;
import com.sw.service.DiaryCommentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DiaryCommentServiceTest {
	@Autowired
	DiaryCommentService cSvc;
	@Test
	public void testInserDiaryComment() throws Exception{
		int idx = 1;
		int dno = 3;
		String cmt = "jUnitTest";
		cSvc.insertDiaryComment(new DiaryCommentDto(idx, dno, cmt));
		}
	
	@Test
	public void testUpDateDiaryComment() throws Exception{
		int cno = 270;
		String cmt = "What????";
		Date date = new Date(1,1,1);
		cSvc.updateDiaryComment(new DiaryCommentDto(cno,0,0,cmt,date));
	}
	
	@Test
	public void testDeleteDiaryComment() throws Exception {
		int cno = 268;
		cSvc.deleteDiaryComment(cno);
	}
}
