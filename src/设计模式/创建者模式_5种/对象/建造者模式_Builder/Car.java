package 设计模式.创建者模式_5种.对象.建造者模式_Builder;

// 定义一个抽象汽车类Car
public class Car {
    private String body;
    private String engine;
    private String tire;

    public void setBody(String body) {
        this.body = body;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    public void showInfo() {
        System.out.println("Car Info:");
        System.out.println("Body:" + body);
        System.out.println("Engine:" + engine);
        System.out.println("Tire:" + tire);
    }
}

