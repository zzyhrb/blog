package com.zzy.blog.service.bolg;

import com.zzy.blog.mapper.BlogMapper;
import com.zzy.blog.pojo.Blog;
import com.zzy.blog.vo.BlogVo;
import com.zzy.blog.vo.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: zzy
 * @Date: $ $
 * @Description:
 */
@Service
public interface IBlogService {

    public List<Blog> queryBlogAll (BlogVo blogVo);


    /**
     * @description:查询博客信息并且分页
     * @author zzy
     * @date 2020/9/4 13:59
     */
    public ServerResponse queryBlogs(int pageNo,int pageSize);

    /**
     * 根据id 获取博客内容表
     * @param id
     * @return
     */
    public ServerResponse getBlogById(Integer id);

    public ServerResponse getBlogByIdMap(Integer id);
}
