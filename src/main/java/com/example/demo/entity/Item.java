package com.example.demo.entity;

import lombok.Data;

@Data
public class Item {
    private Integer id; //id 整数
    private String itemName; //itemの名前
    private Integer price; //価格 整数
}
