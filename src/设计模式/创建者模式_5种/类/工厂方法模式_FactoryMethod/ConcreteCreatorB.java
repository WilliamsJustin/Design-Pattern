package 设计模式.创建者模式_5种.类.工厂方法模式_FactoryMethod;

// 具体工厂ConcreteCreatorB：
public class ConcreteCreatorB implements Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}

