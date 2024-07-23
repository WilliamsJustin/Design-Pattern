package 设计模式.结构性模式_7种.对象.装饰模式_Decorator;

// 具体装饰类 LeatherSeatsDecorator（皮座椅）
class LeatherSeatsDecorator extends CarDecorator {
    public LeatherSeatsDecorator(Car car) {
        super(car);
    }

    public String getDescription() {
        return car.getDesription() + ",with leather seats";
    }

    public int getPrice() {
        return car.getPrice() + 4000;
    }
}

