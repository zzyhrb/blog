package com.zzy.blog.controller.blog;

import com.zzy.blog.service.bolg.BlogServiceImpl;
import com.zzy.blog.service.bolg.IBlogService;
import com.zzy.blog.vo.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author zzy
 * @date 2020/9/3 14:21
 */
@Controller
public class BlogController {

    @Autowired
    private BlogServiceImpl blogService;

    @ResponseBody
    @GetMapping("/blog/query")
    public ServerResponse blogquery(@RequestParam(value = "pageNo",defaultValue = "1",required = false)Integer pageNo,
                                    @RequestParam(value ="pageSize",defaultValue = "10",required = false)Integer pageSize){


        return blogService.queryBlogs(pageNo,pageSize);
    }



}
