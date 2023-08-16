package com.sw.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sw.dto.DiaryCommentDto;

@Repository
public class DiaryCommentDaoImpl implements DiaryCommentDao {
	@Autowired
	SqlSession sqlsession;
	
	@Override
	public void addDiaryComment(DiaryCommentDto dto) {
		sqlsession.insert("diaryCommentMapper.addDiaryComment", dto);
	}
	
	@Override
	public void updateDiaryComment(DiaryCommentDto dto) {
		sqlsession.update("diaryCommentMapper.updateDiaryComment", dto);
	}
	
	@Override
	public void delDiaryComment(int cno) {
		sqlsession.delete("diaryCommentMapper.deleteDiaryComment", cno);
	}
}
