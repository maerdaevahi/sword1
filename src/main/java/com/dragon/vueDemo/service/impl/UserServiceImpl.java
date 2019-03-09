package com.dragon.vueDemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dragon.vueDemo.bean.User;
import com.dragon.vueDemo.bean.UserCondition;
import com.dragon.vueDemo.mapper.UserMapper;
import com.dragon.vueDemo.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper; 
	@Override
	public User insert(User user) {
		int count = userMapper.insert(user);
		return count == 1 ? user : null;
	}

	@Override
	public int deleteUserById(Integer id) {
		return userMapper.deleteUserById(id);
	}

	@Override
	public int updateUserById(User user) {
		return userMapper.updateUserById(user);
	}

	@Override
	public User selectUserById(Integer id) {
		return userMapper.selectUserById(id);
	}

	@Override
	public List<User> selectUserAnd(UserCondition userCondition) {
		return userMapper.selectUserAnd(userCondition);
	}

}
