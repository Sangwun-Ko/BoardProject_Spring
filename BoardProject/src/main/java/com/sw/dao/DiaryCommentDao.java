package com.sw.dao;

import com.sw.dto.DiaryCommentDto;

public interface DiaryCommentDao {
	void addDiaryComment(DiaryCommentDto dto);
	void updateDiaryComment(DiaryCommentDto dto);
	void delDiaryComment(int cno);
}
