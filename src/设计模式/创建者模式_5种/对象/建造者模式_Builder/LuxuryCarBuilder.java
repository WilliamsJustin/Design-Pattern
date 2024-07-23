package 设计模式.创建者模式_5种.对象.建造者模式_Builder;

// 具体建造者——豪华汽车建造者LuxuryCarBuilder
public class LuxuryCarBuilder implements Builder {
    private Car car;

    public LuxuryCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildBody() {
        car.setBody("豪华车身");
    }

    @Override
    public void buildEngine() {
        car.setEngine("豪华发动机");
    }

    @Override
    public void buildTire() {
        car.setTire("豪华轮胎");
    }

    @Override
    public Car getResult() {
        return car;
    }
}

