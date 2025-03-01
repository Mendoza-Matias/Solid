package com.solid.example.nlsp;

public class RectangleNoLsp {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int calculateArea() {
        return width * height;
    }

    public int getArea() {
        return calculateArea();
    }
}
