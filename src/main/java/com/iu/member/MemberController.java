package com.iu.member;

import org.junit.runner.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/member/**")
public class MemberController {
	
	@RequestMapping(value="memberLogin",method=RequestMethod.GET)
	public void MemberLogin(){
		
		//경로명과 도착하는 주소가 같다면 void로 선언해주어도 됨
		//WEB-INF/views/
		//+ member/memberLogin
		//+ .jsp
		//WEB-INF/views/member/memberLogin.jsp
	}
	
	@RequestMapping(value="memberLogin",method=RequestMethod.POST)
	public String memberLogin2(){
		return "member/result";
	}
	
	
}
