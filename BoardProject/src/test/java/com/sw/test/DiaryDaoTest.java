package com.sw.test;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sw.dao.DiaryDao;
import com.sw.dto.DiaryCommentDto;
import com.sw.dto.DiaryDto;
import com.sw.dto.DiaryLikeDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DiaryDaoTest {
	@Autowired
	DiaryDao dDao;
	@Test
	public void testGetDiaryList() throws Exception{
		ArrayList<DiaryDto> dlist = dDao.getDiaryList();
		for(DiaryDto dto : dlist) {
			System.out.println(dto.getTitle());
			System.out.println(dto.getDiary_date());
			System.out.println(dto.getNick_name());
			System.out.println(dto.getMain_img());
		}
	}
	@Test
	public void testSelectDiaryDetail() throws Exception{
		int dno = 3;
		DiaryDto dto = dDao.selectDiaryDetail(dno);
		System.out.println("제목 : " + dto.getTitle());
		System.out.println("내용 : " + dto.getContent());
		System.out.println(dto.getLikecnt());
	}
	
	@Test
	public void testSelectCheckDiaryLike() throws Exception{
		int idx=1;
		int dno=6;
		boolean check = dDao.checkDiaryLike(idx, dno);
		System.out.println(check);
	}
	
	@Test
	public void testSelectDiaryCommentByDno() throws Exception{
		int dno = 1;
		ArrayList<DiaryCommentDto> cList = dDao.selectDiaryCommentListByDno(dno);
		for(DiaryCommentDto dto : cList) {
			System.out.println("내용 : " + dto.getDiary_cmt());
			System.out.println("CNO : " + dto.getCno());
			System.out.println("날짜 : " + dto.getCm_date());
		}
	}
	
	@Test
	public void testInsertDiaryLike() throws Exception{
		int idx = 2;
		int dno = 5;
		dDao.InsertDiaryLike(new DiaryLikeDto(idx,dno));
		System.out.println("성공");
	}
	
	@Test
	public void testDeleteDiaryLike() throws Exception{
		int idx = 1;
		int dno = 12;
		dDao.DeleteDiaryLike(new DiaryLikeDto(idx,dno));
		System.out.println("NO");
	}
	
	@Test
	public void testInsertDiary() throws Exception {
		String title = "Test";
		String content = "Test1";
		int idx = 1;
		dDao.insertDiary(new DiaryDto(title,content,idx));
	}

}
