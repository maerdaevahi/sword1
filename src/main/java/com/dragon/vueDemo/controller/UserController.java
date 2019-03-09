package com.dragon.vueDemo.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dragon.vueDemo.bean.*;
import com.dragon.vueDemo.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("user")
public class UserController {
	private static final ObjectMapper mapper = new ObjectMapper();
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	@Autowired
	private UserService userService;
	@RequestMapping("register")
	@ResponseBody
	public Object register(@Valid User user, BindingResult result) {
		if (!result.hasErrors()) {
			Date now = new Date();
			String nowStr = dateFormat.format(now);
			user.setCreateTime(nowStr);
			user.setModifyTime(nowStr);
			User userFromDB = userService.insert(user);
			AsynResult<String> asynRes = new AsynResult<>();
			asynRes.setStatus("success");
			asynRes.setMsg(null);
			asynRes.setData("index.jsp");
			String asyn = null;
			try {
				asyn = mapper.writeValueAsString(asynRes);
				return asyn;
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	@RequestMapping("login")
	@ResponseBody
	public String login(UserCondition userCondition, HttpSession session, @CookieValue(value = "token", defaultValue = "") String token) {
		if (session.getAttribute("user") != null)
			return "user/tomain";
		else if (userCondition != null)
			return authenticate(userCondition, session);
		else if(token != null && !token.equals("")) {
			try {
				User user = mapper.readValue(token, User.class);
				userCondition = new UserCondition();
				userCondition.setUsername(user.getUsername());
				userCondition.setPassword(user.getPassword());
				return authenticate(userCondition, session);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		session.setAttribute("msg", "用户名或密码错误");
		return "index.jsp";
	}
	
	private String authenticate(UserCondition userCondition, HttpSession session) {
		List<User> users = userService.selectUserAnd(userCondition);
		System.out.println(users);
		if (users == null || users.size() == 0) {
			session.setAttribute("msg", "用户名或密码错误");
			return "index.jsp";
		}
		User user = users.get(0);
		user.setPassword(null);
		session.setAttribute("user", user);
		return "user/tomain";	
	}
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:../index.jsp";
	}
}
