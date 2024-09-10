package com.tedu.egmybatis.pojo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component("comment")
public class Comment {//对应数据库中的评论表
    private static final String NAME = "comment";
    //添加字段属性id,content,created,user_id,weibo_id
    private Integer id;
    private String content;
    private Date created;
    private Integer userId;
    private Integer weiboId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(Integer weiboId) {
        this.weiboId = weiboId;
    }

    @Override
    public String toString() {//重写toString方法,输出对象信息（打桩）
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", userId=" + userId +
                ", weiboId=" + weiboId +
                '}';
    }
}
