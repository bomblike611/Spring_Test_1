package com.iu.s1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value="/test/test1", method = RequestMethod.GET)
	public String test1(){
		return "test/test1";
	}
	
	
}
