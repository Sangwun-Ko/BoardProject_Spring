package com.sw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.dao.DiaryCommentDao;
import com.sw.dto.DiaryCommentDto;

@Service
public class DiaryCommentServiceImpl implements DiaryCommentService {
	
	@Autowired
	DiaryCommentDao cDao;
	
	@Override
	public void insertDiaryComment(DiaryCommentDto dto) {
		cDao.addDiaryComment(dto);
	}
	
	@Override
	public void updateDiaryComment(DiaryCommentDto dto) {
		cDao.updateDiaryComment(dto);
	}
	
	@Override
	public void deleteDiaryComment(int cno) {
		cDao.delDiaryComment(cno);
	}
}
