package com.zzy.blog.service.comment;

import com.zzy.blog.pojo.Comment;
import com.zzy.blog.vo.ServerResponse;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author: zzy
 * @Date: $ $
 * @Description:
 */
public interface ICommentService {

    /**
     * @description:保存评论
     * @author zzy
     * @date 2020/9/7 22:03
     */
    public ServerResponse saveComment(Comment comment);

    /**
     * @description:查询所有文章评论
     * @author zzy
     * @date 2020/9/9 14:54
     */
    public ServerResponse queryCommentAll(Integer blogId,int pageNo ,int pageSize);

    public ServerResponse getCommentById(Integer id);
}
