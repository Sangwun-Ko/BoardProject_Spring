package com.sw.dto;

import java.sql.Date;

public class DiaryCommentDto {
	private int cno;
	private int idx;
	private int dno;
	private String diary_cmt;
	private Date cm_date;
	
	public DiaryCommentDto() { }
	public DiaryCommentDto(int cno, int idx, int dno, String diary_cmt, Date cm_date) {
		this.cno = cno;
		this.idx = idx;
		this.dno = dno;
		this.diary_cmt = diary_cmt;
		this.cm_date = cm_date;
	}
	
	public DiaryCommentDto(int idx, int dno, String diary_cmt) {
		this.idx = idx;
		this.dno = dno;
		this.diary_cmt = diary_cmt;
	}
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDiary_cmt() {
		return diary_cmt;
	}
	public void setDiary_cmt(String diary_cmt) {
		this.diary_cmt = diary_cmt;
	}
	public Date getCm_date() {
		return cm_date;
	}
	public void setCm_date(Date cm_date) {
		this.cm_date = cm_date;
	}
	
	
}
