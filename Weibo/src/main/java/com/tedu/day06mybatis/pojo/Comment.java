package com.tedu.day06mybatis.pojo;

import java.util.Date;

/**
 * CREATE TABLE comment(
 *     id INT PRIMARY KEY AUTO_INCREMENT,      #主键
 *     content VARCHAR(255),                   #评论内容
 *     created TIMESTAMP,                      #发表时间
 *     user_id INT,                            #外键->user表主键
 *     weibo_id INT                            #外键->weibo表主键
 * );
 */
public class Comment {
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
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", userId=" + userId +
                ", weiboId=" + weiboId +
                '}';
    }
}
