package com.sw.service;

import com.sw.dto.DiaryCommentDto;

public interface DiaryCommentService {
	void insertDiaryComment(DiaryCommentDto dto);
	void updateDiaryComment(DiaryCommentDto dto);
	void deleteDiaryComment(int cno);
}
