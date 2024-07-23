package 设计模式.结构性模式_7种.对象.组合模式_Composite;

// 叶子节点 Circle
class Circle implements Shape {
    private int x;
    private int y;
    private int radius; // 半径

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle at (" + x + "," + y + ") with radius " + radius);
    }
}

