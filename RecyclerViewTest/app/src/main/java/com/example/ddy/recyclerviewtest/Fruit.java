package com.example.ddy.recyclerviewtest;

/**
 * @author sty
 * @date 2019/06/17 9:52
 * @desc
 */
public class Fruit {
    private String name;
    private int imageId;
    public Fruit(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
