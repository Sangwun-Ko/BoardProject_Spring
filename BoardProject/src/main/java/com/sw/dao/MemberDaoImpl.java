package com.sw.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sw.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	SqlSession sqlsession;


	@Override
	public String getMemberEmail(int idx) {

		return sqlsession.selectOne("memberMapper.getEmailById", idx);
	}


	@Override
	public String getMemberPw(String email) {
		return sqlsession.selectOne("memberMapper.getPwByEmail", email);
	}

	@Override
	public MemberDto getMemberInfo(MemberDto dto) {
		return sqlsession.selectOne("memberMapper.getMemberInfo", dto);
	}
}
