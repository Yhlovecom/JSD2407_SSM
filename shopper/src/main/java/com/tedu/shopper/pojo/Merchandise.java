package com.tedu.shopper.pojo;

public class Merchandise {//用于向商品表中传输数据对象
    private Integer id;
    private String name;
    private String price;//价格
    private String num;//库存
    private String type;//商品类型

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "merchandise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", num='" + num + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
