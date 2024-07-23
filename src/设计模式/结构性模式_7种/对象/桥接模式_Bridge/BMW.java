package 设计模式.结构性模式_7种.对象.桥接模式_Bridge;

// 具体实现化角色 BMW
class BMW implements CarImpl {
    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public double getPrice() {
        return 500000.0;
    }
}

