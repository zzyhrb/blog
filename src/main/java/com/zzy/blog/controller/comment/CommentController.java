package com.zzy.blog.controller.comment;

import com.zzy.blog.pojo.Comment;
import com.zzy.blog.service.comment.ICommentService;
import com.zzy.blog.vo.ServerResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: zzy
 * @Date: $ $
 * @Description:
 */
@Controller
public class CommentController {
    @Autowired
    private ICommentService commentService;

    @GetMapping("/comment")
    public String commentindex(){
        return "comment/index";
    }

    @ResponseBody
    @GetMapping("/comment/queryAll/{blogId}/{pageNo}/{pageSize}")
    public ServerResponse queryAll(@PathVariable("blogId")Integer blogId,
                           @PathVariable("pageNo")Integer pageNo,
                           @PathVariable("pageSize")Integer pageSize
                           ){
            if(pageNo ==null) pageNo=1;
            if(pageSize == null )pageSize=10;
       return  commentService.queryCommentAll(blogId,pageNo,pageSize);

    }


    @ResponseBody
    @GetMapping("/comment/get/{id}")
    public ServerResponse getComment(@PathVariable("id") Integer id){

        return commentService.getCommentById(id);

    }
    @ResponseBody
    @GetMapping("/comment/save")
    public ServerResponse saveComment(Comment comment){

        return commentService.saveComment(comment);
    }


}
