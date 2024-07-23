package 设计模式.结构性模式_7种.对象.桥接模式_Bridge;

// 具体实现化角色 Audi
class Audi implements CarImpl {
    @Override
    public String getBrand() {
        return "Audi";
    }

    @Override
    public double getPrice() {
        return 400000.0;
    }
}

