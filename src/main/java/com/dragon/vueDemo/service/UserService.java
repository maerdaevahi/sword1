package com.dragon.vueDemo.service;

import java.util.List;
import com.dragon.vueDemo.bean.*;

public interface UserService {
	User insert(User user);
	int deleteUserById(Integer id);
	int updateUserById(User user);
	User selectUserById(Integer id);
	List<User> selectUserAnd(UserCondition userCondition);
}

