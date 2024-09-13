package com.tedu.day06mybatis.pojo;

import java.util.List;

public class WeiboVO3 {//（微博视图3）微博用户（User）与用户该用户的所有评论（Comment）
    private int userId;//对应用户（User）的id属性
    private String username;//对应用户（User）的username属性
    private List<Comment> comments;//对应评论（Comment）的集合属性，通过user_id属性关联查询的结果

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "WeiboVO3{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", comments=" + comments +
                '}';
    }
}
