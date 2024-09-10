package com.tedu.day06mybatis.pojo;

public class WeiboVO2 {//微博信息视图
    private Integer id;
    private String content;
    private Integer userId;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "WeiboVO2{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                '}';
    }
}
