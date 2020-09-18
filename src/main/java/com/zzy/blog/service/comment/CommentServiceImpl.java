package com.zzy.blog.service.comment;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzy.blog.mapper.CommentMapper;
import com.zzy.blog.pojo.Comment;
import com.zzy.blog.vo.CommentVo;
import com.zzy.blog.vo.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: zzy
 * @Date: $ $
 * @Description:
 */
@Service
public class CommentServiceImpl implements ICommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public ServerResponse saveComment(Comment comment) {
        comment.setUserId(1);
        comment.setIp("127.0.0.1");
        comment.setStatus(1);
        int count = commentMapper.saveComment(comment);
        return count>0?ServerResponse.createBySuccess(comment):ServerResponse.createByError();
    }

    /**
     * @description:查询第一级评论
     * @author zzy
     * @date 2020/9/9 15:11
     */
    @Override
    public ServerResponse queryCommentAll(Integer blogId, int pageNo, int pageSize) {
        //分页
        PageHelper.startPage(pageNo,pageSize);
        List<Map<String,Object>> comments =   commentMapper.queryCommentAll(blogId);

        //递归查询所有评论
        recursionChildren(comments);
        PageInfo<Map<String,Object>> pageInfo =new PageInfo<>(comments);
        return ServerResponse.createBySuccess(pageInfo);
    }
    public  void recursionChildren (List<Map<String, Object>> parentList) {
        //循环第一级的评论信息，把对应的所有的子评论，全部抓出来，然后继续放入第一级评论的map中追加children节点
        for (Map<String, Object> parentMap : parentList) {
            Integer  parentId = (Integer) parentMap.get("id");
            Integer  blogId = (Integer) parentMap.get("blogId");
            //检索获取每个元素的所有的子节点
            List<Map<String, Object>> childrenComments = commentMapper.queryCommentByParentId(blogId, parentId); //2
            //空元素去接
            List<Map<String, Object>> childrenList = new ArrayList<>();
            if(childrenComments!=null && childrenComments.size()>0) {
                //递归
                recursionChildren(childrenComments);
                //追加到容器中comments
                parentMap.put("children",childrenComments);
            }else {
                parentMap.put("children",childrenList);
            }
        }
    }
    @Override
    public ServerResponse getCommentById(Integer id) {
        return null;
    }
}
