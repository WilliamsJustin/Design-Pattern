package 设计模式.结构性模式_7种.对象.装饰模式_Decorator;

// 抽象装饰类 CarDecorator
abstract class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public String getDesription() {
        return car.getDesription();
    }

    public int getPrice() {
        return car.getPrice();
    }
}

