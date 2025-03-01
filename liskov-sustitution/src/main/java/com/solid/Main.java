package com.solid;

import com.solid.example.lsp.Rectangle;
import com.solid.example.lsp.Square;
import com.solid.example.nlsp.PentagonNoLsp;
import com.solid.example.nlsp.RectangleNoLsp;

public class Main {
    public static void main(String[] args) {
        RectangleNoLsp rectangleNoLSP = new RectangleNoLsp();
        rectangleNoLSP.setWidth(20);
        rectangleNoLSP.setHeight(10);

        PentagonNoLsp pentagonNoLSP = new PentagonNoLsp();
        pentagonNoLSP.setWidth(20);
        pentagonNoLSP.setHeight(10);

        Rectangle rectangle = new Rectangle();
        rectangle = new Square();
        rectangle.setHeight(20);
    }
}