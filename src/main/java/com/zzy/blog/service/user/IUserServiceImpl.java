package com.zzy.blog.service.user;

import com.zzy.blog.pojo.User;
import com.zzy.blog.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements UserService {
    @Autowired
    private IUserMapper userMapper;
    /**
     * @description: 根据用户id查询用户信息
     * @author zzy
     * @date 2020/9/2 17:05
     */
    @Override
    public User getUser(Long id) {
        return userMapper.getUser(id);
    }
}
