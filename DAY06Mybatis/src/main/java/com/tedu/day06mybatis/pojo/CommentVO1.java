package com.tedu.day06mybatis.pojo;

public class CommentVO1 {
    private String content;
    private Integer userId;

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
        return "CommentVO1{" +
                "content='" + content + '\'' +
                ", userId=" + userId +
                '}';
    }
}
