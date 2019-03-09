package com.dragon.vueDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("{module}/to{page}")
	public String toPage(@PathVariable("module") String module, @PathVariable("page") String page) {
		System.out.println(page);
		return page;
	}
}
