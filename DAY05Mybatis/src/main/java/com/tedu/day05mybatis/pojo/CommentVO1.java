package com.tedu.day05mybatis.pojo;

public class CommentVO1 {//评论视图对象（将评论内容与评论的用户对应）
    private String content;//评论内容
    private Integer userId;//评论用户id

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "CommentOV1{" +
                "content='" + content + '\'' +
                ", userId=" + userId +
                '}';
    }
}
