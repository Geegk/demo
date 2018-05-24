package com.geegk.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 这个是测试SpringBoot的程序
 * @author lyc
 *
 */
@Controller
public class HelloWorld {
	@ResponseBody
	@RequestMapping(value="/helloworld")
	public String helloWorld() {
		return "SpringBoot开始吧！";
	}
}
