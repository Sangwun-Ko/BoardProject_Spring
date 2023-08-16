package com.sw.dao;

import com.sw.dto.MemberDto;

public interface MemberDao {
	String getMemberEmail(int idx);
	String getMemberPw(String email);
	MemberDto getMemberInfo(MemberDto dto);
}
