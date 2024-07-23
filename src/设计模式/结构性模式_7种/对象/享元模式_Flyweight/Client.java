package 设计模式.结构性模式_7种.对象.享元模式_Flyweight;

// 客户端 Client
public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("A");
        flyweight1.operation("1");
        Flyweight flyweight2 = factory.getFlyweight("B");
        flyweight2.operation("2");
        Flyweight flyweight3 = factory.getFlyweight("A");
        flyweight3.operation("3");
    }
}

