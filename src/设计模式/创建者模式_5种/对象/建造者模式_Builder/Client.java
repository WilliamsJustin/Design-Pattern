package 设计模式.创建者模式_5种.对象.建造者模式_Builder;

// 在使用这些类的时候，我们可以像下面这样来使用：
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        NormalCarBuilder normalCarBuilder = new NormalCarBuilder();
        Car normalCar = director.construcCar(normalCarBuilder);
        normalCar.showInfo();
        LuxuryCarBuilder luxuryCarBuilder = new LuxuryCarBuilder();
        Car luxuryCar = director.construcCar(luxuryCarBuilder);
        luxuryCar.showInfo();
    }
}

