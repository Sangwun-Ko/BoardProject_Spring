package com.sw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.dao.MemberDao;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberDao mDao;


	@Override
	public boolean checkLogin(String email, String pw) {
		String pwFromDB = mDao.getMemberPw(email);
		if(pw != null && pw.equals(pwFromDB)) {
			return true;	//로그인 성공
		}

		return false;	//로그인 실패
	}
}
