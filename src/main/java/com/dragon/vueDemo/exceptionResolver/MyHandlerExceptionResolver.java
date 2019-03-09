package com.dragon.vueDemo.exceptionResolver;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class MyHandlerExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
			String contextPath = request.getContextPath();
			System.out.println("contextPath: " + contextPath);
			//一下的/是应用根目录原生servlet重定向的/是站点根目录
			ModelAndView mv = new ModelAndView("redirect:/index.jsp");
			return mv;
	}

}
