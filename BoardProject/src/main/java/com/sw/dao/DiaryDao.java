package com.sw.dao;

import java.util.ArrayList;

import com.sw.dto.DiaryCommentDto;
import com.sw.dto.DiaryDto;
import com.sw.dto.DiaryLikeDto;

public interface DiaryDao {
	ArrayList<DiaryDto> getDiaryList();
	DiaryDto selectDiaryDetail(int dno);
	void insertDiary(DiaryDto dto);
	boolean checkDiaryLike(int idx, int dno);
	ArrayList<DiaryCommentDto> selectDiaryCommentListByDno(int dno);
	void InsertDiaryLike(DiaryLikeDto dto);
	void DeleteDiaryLike(DiaryLikeDto dto);
}
