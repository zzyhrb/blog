package com.zzy.blog.mapper;

import com.zzy.blog.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface IUserMapper {
	/**
	 * @description:
	 * @author zzy
	 * @date 2020/9/2 17:07
	 */
	public User getUser(@Param("id") Long id);
}
