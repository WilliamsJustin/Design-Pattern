package 设计模式.结构性模式_7种.对象.桥接模式_Bridge;

// 扩充抽象化角色
class SedanCar extends Car {
    public SedanCar(CarImpl carImpl) {
        super(carImpl);
    }

    @Override
    void showDetails() {
        System.out.println("This is a " + carImpl.getBrand() + " sedan car,priced at " + carImpl.getPrice());
    }
}

