package com.sw.dto;

public class MemberDto {
	private int idx;
	private String email;
	private String pw;
	private String nick_name;

	public MemberDto(int idx, String email, String pw, String nick_name) {
		this.idx = idx;
		this.email = email;
		this.pw = pw;
		this.nick_name = nick_name;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}


}
