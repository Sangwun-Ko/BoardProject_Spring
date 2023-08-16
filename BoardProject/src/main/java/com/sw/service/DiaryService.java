package com.sw.service;

import java.util.ArrayList;

import com.sw.dto.DiaryCommentDto;
import com.sw.dto.DiaryDto;
import com.sw.dto.DiaryLikeDto;

public interface DiaryService {
	ArrayList<DiaryDto> getDiaryList();
	DiaryDto getDiaryDetail(int dno);
	void addDiary(DiaryDto dto);
	boolean getCheckDiaryLikeByMember(int idx, int dno);
	ArrayList<DiaryCommentDto> getCommentByDno(int dno);
	void clickDiaryLikeButton(DiaryLikeDto dto);
	void clickDiaryLikeButtonDelete(DiaryLikeDto dto);
}
