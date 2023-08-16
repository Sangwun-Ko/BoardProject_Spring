package com.sw.test;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sw.dto.DiaryCommentDto;
import com.sw.dto.DiaryDto;
import com.sw.dto.DiaryLikeDto;
import com.sw.service.DiaryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DiaryServiceTest {
	@Autowired
	DiaryService dSvc;
	@Test
	public void testGetDiaryList() throws Exception{
		ArrayList<DiaryDto> list = dSvc.getDiaryList();
		
		for(DiaryDto dto : list) {
			System.out.println("Dno : " +dto.getDno());
			System.out.println("제목 : " + dto.getTitle());
			System.out.println("작성자 : " + dto.getNick_name());
		}
	}
	@Test
	public void testGetDiaryDetail() throws Exception{
		int dno = 3;
		DiaryDto diary = dSvc.getDiaryDetail(dno);
		System.out.println("제목 : " + diary.getTitle());
		System.out.println("내용 : " + diary.getContent());
	}
	
	@Test
	public void testCheckDiaryLikeByMember() throws Exception{
		int idx = 1;
		int dno = 7;
		boolean check = dSvc.getCheckDiaryLikeByMember(idx,dno);
		System.out.println(check);
	}
	@Test
	public void testDiaryCommentListByDno() throws Exception{
		int dno = 1;
		ArrayList<DiaryCommentDto> list = dSvc.getCommentByDno(dno);
		for(DiaryCommentDto dto : list) {
			System.out.println("내용 : " + dto.getDiary_cmt());
		}
	}
	
	@Test
	public void testDiaryLikeButton() throws Exception{
		int idx=2;
		int dno=7;
		dSvc.clickDiaryLikeButton(new DiaryLikeDto(idx,dno));
	}
	@Test
	public void testDiaryLikeButtonDelete() throws Exception{
		int idx = 1;
		int dno = 10;
		dSvc.clickDiaryLikeButtonDelete(new DiaryLikeDto(idx,dno));
	}
	
	@Test
	public void testAddDiary() throws Exception {
		String title = "SvcTest";
		String content ="SvcTest";
		int idx = 1;
		dSvc.addDiary(new DiaryDto(title,content,idx));
	}
}
