package 设计模式.创建者模式_5种.类.工厂方法模式_FactoryMethod;

// 定义一个抽象工厂Creator接口，factoryMethod()是工厂方法，用于创建一个Product对象。
public interface Creator {
    Product factoryMethod();
}
