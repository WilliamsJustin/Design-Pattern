package 设计模式.创建者模式_5种.对象.建造者模式_Builder;

// 定义一个指挥者Director类：
public class Director {
    public Car construcCar(Builder builder) {
        builder.buildBody();
        builder.buildEngine();
        builder.buildTire();
        return builder.getResult();
    }
}

