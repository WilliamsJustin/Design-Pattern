package 设计模式.结构性模式_7种.对象.装饰模式_Decorator;

// 具体装饰类 GPSDecorator（GPS）
class GPSDecorator extends CarDecorator {
    public GPSDecorator(Car car) {
        super(car);
    }

    public String getDescription() {
        return car.getDesription() + ",with GPS";
    }

    public int getPrice() {
        return car.getPrice() + 2000;
    }
}

