package com.sw.controller;

import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sw.dto.DiaryCommentDto;
import com.sw.dto.DiaryDto;
import com.sw.dto.DiaryLikeDto;
import com.sw.service.DiaryCommentService;
import com.sw.service.DiaryService;

@Controller
public class DiaryController {
	@Autowired
	DiaryService dSvc;
	@Autowired
	DiaryCommentService cSvc;
	
	@RequestMapping(value = "/diary")
	public String diary(Model model) {
		ArrayList<DiaryDto> dlist = dSvc.getDiaryList();
		model.addAttribute("diaryList", dlist);
		return "diary";
	}
	@RequestMapping(value = "/addDiary")
	public String addDiary(String title, String content, int idx) {
			dSvc.addDiary(new DiaryDto(title, content, idx));
		return "redirect:/diary";
	}
	@RequestMapping(value = "/diaryDetail")
	public String diaryDetail(HttpSession session, int dno, Model model) {
		int idx = 0;
		DiaryDto dto = dSvc.getDiaryDetail(dno);
		ArrayList<DiaryCommentDto> cmtList = dSvc.getCommentByDno(dno);
		if(session.getAttribute("loginidx")!=null) {
			idx = (int)session.getAttribute("loginidx");
		}
		boolean check = dSvc.getCheckDiaryLikeByMember(idx, dno);
		model.addAttribute("dno", dno);
		model.addAttribute("checkLike", check);
		model.addAttribute("cmtList", cmtList);
		model.addAttribute("dDetail", dto); 
		return "diaryDetail";
	}
	
	@RequestMapping(value = "/doLikeButtonInsert")
	public @ResponseBody void DoLikeDiaryInsert(HttpSession session, int dno) {
		if(session.getAttribute("loginidx")!=null) {
			int idx=(int)session.getAttribute("loginidx");
			dSvc.clickDiaryLikeButton(new DiaryLikeDto(idx,dno));
		}
	}
	@RequestMapping(value = "/doLikeButtonDelete")
	public @ResponseBody void DoLikeDiaryDelete(HttpSession session, int dno) {
		if(session.getAttribute("loginidx")!=null) {
			int idx=(int)session.getAttribute("loginidx");
			dSvc.clickDiaryLikeButtonDelete(new DiaryLikeDto(idx,dno));
		}
	}
	
	@RequestMapping(value = "/writeBoard")
	public String writeBoard() {
		return "write_board";
	}
	
	@RequestMapping(value = "/addDiaryComment")
	public @ResponseBody void addDiaryComment(int idx, int dno, String cmt) {
		cSvc.insertDiaryComment(new DiaryCommentDto(idx,dno,cmt));
	}
	
	@RequestMapping(value = "/UpdateDiaryComment")
	public @ResponseBody void UpdateDiaryComment(int cno, String cmt) {
		cSvc.updateDiaryComment(new DiaryCommentDto(cno,0,0,cmt,new Date(1,1,1)));
	}
	
	@RequestMapping(value = "/DeleteDiaryComment")
	public @ResponseBody void DeleteDiaryComment(int cno) {
		cSvc.deleteDiaryComment(cno);
	}
}
