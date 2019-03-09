package com.dragon.vueDemo.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.dragon.vueDemo.bean.*;

public interface UserMapper {
	int insert(User user);
	int deleteUserById(Integer id);
	int updateUserById(User user);
	User selectUserById(Integer id);
	List<User> selectUserAnd(@Param("userCondition") UserCondition userCondition);
}
