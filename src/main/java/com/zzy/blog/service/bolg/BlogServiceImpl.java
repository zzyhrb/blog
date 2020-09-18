package com.zzy.blog.service.bolg;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private BlogMapper blogMapper;

    @Override
    public List<Blog> queryBlogAll(BlogVo blogVo) {
        return null;
    }


    @Override
    public ServerResponse queryBlogs(int pageNo, int pageSize) {
        //设置分页
        PageHelper.startPage(pageNo,pageSize);
        //查询数据
        List<Map<String,Object>>  blogs =  blogMapper.queryBlogs();
        //吧分页信息和查血结果组长成一个pageinfo返回给页面
        PageInfo<Map<String,Object>> pageInfo =new PageInfo<>(blogs);
        return ServerResponse.createBySuccess(pageInfo);
    }

    @Override
    public ServerResponse getBlogById(Integer id) {
        Blog blog = blogMapper.getBlogById(id);
        return blog!=null?ServerResponse.createBySuccess(blog):ServerResponse.createByError();
    }

    @Override
    public ServerResponse getBlogByIdMap(Integer id) {
       Map<String,Object> blogs =  blogMapper.getBlogByIdMap(id);


        return blogs!=null?ServerResponse.createBySuccess(blogs):ServerResponse.createByError();
    }
}
