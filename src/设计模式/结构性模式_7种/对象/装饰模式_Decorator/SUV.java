package 设计模式.结构性模式_7种.对象.装饰模式_Decorator;

// 具体组件SUV
class SUV implements Car {
    @Override
    public String getDesription() {
        return "SUV";
    }

    @Override
    public int getPrice() {
        return 25000;
    }
}

