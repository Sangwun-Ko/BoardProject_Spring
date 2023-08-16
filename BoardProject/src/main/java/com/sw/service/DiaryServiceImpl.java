package com.sw.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.dao.DiaryDao;
import com.sw.dto.DiaryCommentDto;
import com.sw.dto.DiaryDto;
import com.sw.dto.DiaryLikeDto;

@Service
public class DiaryServiceImpl implements DiaryService {
	@Autowired
	DiaryDao dDao;
	
	
	@Override
	public ArrayList<DiaryDto> getDiaryList() {
		ArrayList<DiaryDto> list = dDao.getDiaryList();
		return list;
	}
	@Override
	public DiaryDto getDiaryDetail(int dno) {
		DiaryDto diary = dDao.selectDiaryDetail(dno); 
		return diary;
	}
	@Override
	public boolean getCheckDiaryLikeByMember(int idx, int dno) {
		boolean check = dDao.checkDiaryLike(idx, dno);
		return check;
	}
	@Override
	public ArrayList<DiaryCommentDto> getCommentByDno(int dno) {
		ArrayList<DiaryCommentDto> list = dDao.selectDiaryCommentListByDno(dno);
		return list;
	}
	
	@Override
	public void clickDiaryLikeButton(DiaryLikeDto dto) {
		dDao.InsertDiaryLike(dto);
	}
	@Override
	public void clickDiaryLikeButtonDelete(DiaryLikeDto dto) {
		dDao.DeleteDiaryLike(dto);
	}
	@Override
	public void addDiary(DiaryDto dto) {
		dDao.insertDiary(dto);
	}
}
