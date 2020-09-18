package com.zzy.blog.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zzy.blog.pojo.Comment;

/**
 * @description:文章评论
 * @author zzy
 * @date 2020/9/7 20:58
 */
public interface CommentMapper {
	//添加
	public int saveComment(Comment comment);
	//修改
	public int updateComment(Comment comment);
	//删除
	public int deleteCommentById(@Param("id") Integer id);
	//查询单个
	public Comment getCommentById(@Param("id") Integer id);
	//查询所有某篇文章ID对应的评论
	public List<Map<String,Object>> queryCommentAll(@Param("blogId") Integer blogId);
	//查询所有的子评论
	public List<Map<String,Object>> queryCommentByParentId(@Param("blogId") Integer blogId, @Param("parentId") Integer parentId);
}