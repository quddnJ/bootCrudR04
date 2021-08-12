package com.bit.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bit.domain.MemberVO;

@Controller
public class SampleController {

	@GetMapping("/sample1") // templates/sample1.html
	public void sample1(Model model) {
		model.addAttribute("greeting", "반갑습니다.");
	}

	@GetMapping("/sample2")
	public void sample2(Model model) {
		MemberVO vo = new MemberVO(123, "u00", "p00", "길동이", new Timestamp(System.currentTimeMillis()));
		model.addAttribute("vo", vo);
	}

	@GetMapping("/sample3")
	public void sample3(Model model) {
		List<MemberVO> list = new ArrayList<MemberVO>();
		for (int i = 0; i < 10; i++) {
			list.add(new MemberVO(123, "u0" + i, "p0" + i, "길동이" + i, new Timestamp(System.currentTimeMillis())));
		}
		model.addAttribute("list", list);
	}
	
	@GetMapping("/sample4")
	public void sample4(Model model) {
		List<MemberVO> list = new ArrayList<MemberVO>();
		for (int i = 0; i < 10; i++) {
			list.add(new MemberVO(123, "u000" + i%3, "p000" + i%3, "길동이" + i, new Timestamp(System.currentTimeMillis())));
		}
		model.addAttribute("list", list);
	}
	
	// 이건 f12 개발자 툴로 test 하기 위함
	@GetMapping("/sample5")
	public void smaple5(Model model) {
		model.addAttribute("result", "SUCCESS");
	}
	
	@GetMapping("/sample6")
	public void smaple6(Model model) {
	List<MemberVO> list = new ArrayList<MemberVO>();
	for (int i = 0; i < 10; i++) {
		list.add(new MemberVO(123, "u000" + i%3, "p000" + i%3, "길동이" + i, new Timestamp(System.currentTimeMillis())));
	}
	model.addAttribute("list", list);
	model.addAttribute("result", "SUCCESS");
	}
	
	@GetMapping("/sample7")
	public void smaple7(Model model) {
		model.addAttribute("now", new Date());
		model.addAttribute("price", 123456789); //int->Integer(Auto Boxing)
		model.addAttribute("title", "This is a just sample.");
		model.addAttribute("options", Arrays.asList("AAAA","BBB","CCC","DDD"));
	}
	
	@GetMapping("/sample8")
	public void smaple8(Model model) {
		
	}
	
	@GetMapping("/sample9")
	public void smaple9(Model model) {
		
	}
}
