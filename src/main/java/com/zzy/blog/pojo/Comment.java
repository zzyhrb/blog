package com.zzy.blog.pojo;

import java.util.Date;

/**
 * @author: zzy
 * @Date: $ $
 * @Description:
 */
public class Comment {
    private Integer id;
    private Integer userId;
    private Date createTime;
    private String ip;
    private String  content;
    private Integer parentId;
    private Integer replayUserid;
    private Integer status;
    private Integer blogId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getReplayUserid() {
        return replayUserid;
    }

    public void setReplayUserid(Integer replayUserid) {
        this.replayUserid = replayUserid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", ip='" + ip + '\'' +
                ", content='" + content + '\'' +
                ", parentId=" + parentId +
                ", replayUserid=" + replayUserid +
                ", status=" + status +
                ", blogId=" + blogId +
                '}';
    }
}
