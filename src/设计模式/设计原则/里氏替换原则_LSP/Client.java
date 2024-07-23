package 设计模式.设计原则.里氏替换原则_LSP;

// 在使用这些类的时候，我们可以像下面这样来使用：
public class Client {
    public static void main(String[] args) {

        // 长方形
        Shape rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println("rectangle area:" + rectangle.getArea());


        // 正方形
        Shape square = new Square();
        ((Square) square).setSide(5);
        System.out.println("square area:" + square.getArea());
    }
}
