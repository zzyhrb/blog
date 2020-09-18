package com.zzy.blog.controller;

import com.github.pagehelper.PageHelper;
import com.zzy.blog.service.bolg.IBlogService;
import com.zzy.blog.vo.ServerResponse;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@Api(description = "用户查询")

public class IndexController {
    @Autowired
    private IBlogService blogService;

//    @GetMapping("index")
////    public String blogquery(@RequestParam(value = "pageNo",defaultValue = "1",required = false)Integer pageNo,
////                            @RequestParam(value = "pageSize",defaultValue = "10",required = false)Integer pageSize,
////                            ModelMap modelMap){
////        ServerResponse  serverResponse = blogService.queryBlogs(pageNo,pageSize);
////        modelMap.addAttribute("serverResponse",serverResponse);
////
////        return "index";
////    }
    @GetMapping("/index")
    public String index(){

        return "index";
    }

    /**
     * 详情页面
     *
     */
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id,ModelMap model){
        ServerResponse  serverResponse =   blogService.getBlogByIdMap(id);
        model.addAttribute("blog",serverResponse.getData());
        return "detail";
    }



}
