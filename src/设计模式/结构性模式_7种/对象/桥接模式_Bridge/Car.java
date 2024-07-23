package 设计模式.结构性模式_7种.对象.桥接模式_Bridge;

// 抽象化角色 Car
abstract class Car {
    protected CarImpl carImpl;

    public Car(CarImpl carImpl) {
        this.carImpl = carImpl;
    }

    abstract void showDetails();
}

