package 设计模式.结构性模式_7种.对象.组合模式_Composite;

public class Main {
    public static void main(String[] args) {

        // Create some circles
        Shape circle1 = new Circle(10, 10, 5);
        Shape circle2 = new Circle(20, 20, 10);

        // Create a composite shape (rectangle) and add the circles to it
        Rectangle rectangle = new Rectangle();
        rectangle.addShape(circle1);
        rectangle.addShape(circle2);

        // Draw the rectangle (and its component circles)
        rectangle.draw();
    }
}

