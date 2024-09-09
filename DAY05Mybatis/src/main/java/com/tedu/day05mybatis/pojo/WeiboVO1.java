package com.tedu.day05mybatis.pojo;

import java.util.Date;

/*
    VO:value object  值对象
    对应WeiboMapper中selectContent方法，该方法仅查看weibo的两个字段
 */
public class WeiboVO1 {
    private String content;
    private Date created;

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

    @Override
    public String toString() {
        return "WeiboVO1{" +
                "content='" + content + '\'' +
                ", created=" + created +
                '}';
    }
}
