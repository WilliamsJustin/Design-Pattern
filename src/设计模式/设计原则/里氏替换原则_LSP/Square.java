package 设计模式.设计原则.里氏替换原则_LSP;

// Square类（正方形）的代码如下：
public class Square extends Shape {
    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }
}
