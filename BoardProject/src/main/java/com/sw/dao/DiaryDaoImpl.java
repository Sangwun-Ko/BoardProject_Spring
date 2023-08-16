package com.sw.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sw.dto.DiaryCommentDto;
import com.sw.dto.DiaryDto;
import com.sw.dto.DiaryLikeDto;

@Repository
public class DiaryDaoImpl implements DiaryDao {
	@Autowired
	SqlSession sqlsession;
	
	@Override
	public ArrayList<DiaryDto> getDiaryList() {
		List<DiaryDto> list = sqlsession.selectList("diaryMapper.getDiaryList");
		ArrayList<DiaryDto> dlist = new ArrayList<DiaryDto>();
		dlist.addAll(list);
		return dlist;
	}
	@Override
	public DiaryDto selectDiaryDetail(int dno) {
		DiaryDto diary = sqlsession.selectOne("diaryMapper.getDiaryDetail", dno);
		return diary;
	}
	
	@Override
	public boolean checkDiaryLike(int idx, int dno) {
		boolean check = true;
		HashMap<String, Integer> mapParams = new HashMap<String, Integer>();
		mapParams.put("idx", idx);
		mapParams.put("dno", dno);
		if(sqlsession.selectOne("diaryMapper.checkDiaryLike", mapParams)==null) {
			check=false;
		}
		return check;
	}
	
	@Override
	public ArrayList<DiaryCommentDto> selectDiaryCommentListByDno(int dno) {
		List<DiaryCommentDto> list = sqlsession.selectList("diaryCommentMapper.getCommentByDno", dno);
		ArrayList<DiaryCommentDto> cList = new ArrayList<DiaryCommentDto>();
		cList.addAll(list);
		return cList;
	}
	@Override
	public void InsertDiaryLike(DiaryLikeDto dto) {
		sqlsession.insert("diaryMapper.clickLikeButton", dto);
	}
	@Override
	public void DeleteDiaryLike(DiaryLikeDto dto) {
		sqlsession.delete("diaryMapper.clickLikeDelete", dto);
	}
	@Override
	public void insertDiary(DiaryDto dto) {
		sqlsession.insert("diaryMapper.insertDiary", dto);
	}
}
