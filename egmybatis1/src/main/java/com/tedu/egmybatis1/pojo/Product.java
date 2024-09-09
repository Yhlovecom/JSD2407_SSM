package com.tedu.egmybatis1.pojo;

/**
 * CREATE TABLE product(
 *     id INT PRIMARY KEY AUTO_INCREMENT,
 *     title VARCHAR(50),
 *     price INT,
 *     stock INT
 * );
 */
public class Product {
    private Integer id;
    private String title;
    private Integer price;
    private Integer stock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
