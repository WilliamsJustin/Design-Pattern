package 设计模式.结构性模式_7种.对象.组合模式_Composite;

// 容器节点 Rectangle

import java.util.ArrayList;
import java.util.List;

public class Rectangle implements Shape {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle...");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

