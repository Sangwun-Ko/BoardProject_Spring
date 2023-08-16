package com.sw.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sw.dto.NatDto;

@Repository
public class NatDaoImpl implements NatDao{
	@Autowired
	SqlSession sqlsession;

	@Override
	public ArrayList<NatDto> getNationList() {
		List<NatDto> natList = sqlsession.selectList("natMapper.getNatList");
		ArrayList<NatDto> natList2 = new ArrayList<>();
		natList2.addAll(natList);
			return natList2;
	}
}
