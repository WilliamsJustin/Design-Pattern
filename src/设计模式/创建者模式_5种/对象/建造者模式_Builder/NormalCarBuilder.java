package 设计模式.创建者模式_5种.对象.建造者模式_Builder;

// 具体建造者——豪华汽车建造者LuxuryCarBuilder
public class NormalCarBuilder implements Builder {
    private Car car;

    public NormalCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildBody() {
        car.setBody("普通车身");
    }

    @Override
    public void buildEngine() {
        car.setEngine("普通发动机");
    }

    @Override
    public void buildTire() {
        car.setTire("普通轮胎");
    }

    @Override
    public Car getResult() {
        return car;
    }
}

