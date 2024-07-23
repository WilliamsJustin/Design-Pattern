package 设计模式.创建者模式_5种.类.工厂方法模式_FactoryMethod;

// 在使用这些类的时候，我们可以像下面这样来使用：
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreatorA();
        Product product = creator.factoryMethod();
        product.use();

        creator = new ConcreteCreatorB();
        product = creator.factoryMethod();
        product.use();
    }
}
