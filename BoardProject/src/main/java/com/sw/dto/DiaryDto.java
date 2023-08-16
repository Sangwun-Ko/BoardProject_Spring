package com.sw.dto;

import java.sql.Date;

public class DiaryDto {
	private int dno;
	private int idx;
	private String nick_name;
	private String main_img;
	private Date diary_date;
	private String title;
	private String content;
	private int view_cnt;
	private int likecnt;
	private int cmtcnt;
	
	
	public DiaryDto() { }
	public DiaryDto(int dno, int idx, String nick_name, String main_img, Date diary_date, String title, String content,
			int view_cnt, int likecnt, int cmtcnt) {
		this.dno = dno;
		this.idx = idx;
		this.nick_name = nick_name;
		this.main_img = main_img;
		this.diary_date = diary_date;
		this.title = title;
		this.content = content;
		this.view_cnt = view_cnt;
		this.likecnt = likecnt;
		this.cmtcnt = cmtcnt;
	}
	public DiaryDto(String title, String content, int idx) {
		this.title=title;
		this.content=content;
		this.idx=idx;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getMain_img() {
		return main_img;
	}
	public void setMain_img(String main_img) {
		this.main_img = main_img;
	}
	public Date getDiary_date() {
		return diary_date;
	}
	public void setDiary_date(Date diary_date) {
		this.diary_date = diary_date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getView_cnt() {
		return view_cnt;
	}
	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
	}
	public int getLikecnt() {
		return likecnt;
	}
	public void setLikecnt(int likecnt) {
		this.likecnt = likecnt;
	}
	public int getCmtcnt() {
		return cmtcnt;
	}
	public void setCmtcnt(int cmtcnt) {
		this.cmtcnt = cmtcnt;
	}
	
	
}
