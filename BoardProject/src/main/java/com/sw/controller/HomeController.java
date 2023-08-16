package com.sw.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sw.dao.MemberDao;
import com.sw.dto.MemberDto;
import com.sw.dto.NatDto;
import com.sw.service.MemberService;
import com.sw.service.SearchService;

@Controller
public class HomeController {
	@Autowired
	MemberService mSvc;
	
	@Autowired
	SearchService sSvc;
	
	@Autowired
	MemberDao mDao;

	@RequestMapping(value = "/")
	public String home(Model model) {
		ArrayList<NatDto> nDto = sSvc.getMainNationList();
		model.addAttribute("natList", nDto);
		return "home";
	}

	@RequestMapping(value = "/login")
	public String login(Model model) {
		System.out.println("페이지이동");
		return "login";
	}
	@RequestMapping(value = "/loginCheck")
	public String loginCheck(String email, String pw, Model model, HttpSession session) {
		boolean result = false;
		System.out.println("Controller : "+email);
		System.out.println("Controller : "+pw);
		result = mSvc.checkLogin(email, pw);

		if(result) {
			MemberDto dto = mDao.getMemberInfo(new MemberDto(0, email, pw, null));
			session.setAttribute("loginEmail", email);
			session.setAttribute("loginnick", dto.getNick_name());
			session.setAttribute("loginidx", dto.getIdx());
			return "forward:/";
		}
		model.addAttribute("msg", "로그인 오류 입니다.");
		return "/login";
	}
}
