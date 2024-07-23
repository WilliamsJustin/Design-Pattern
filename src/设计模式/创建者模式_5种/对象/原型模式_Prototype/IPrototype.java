package 设计模式.创建者模式_5种.对象.原型模式_Prototype;

// 定义抽象原型类IPrototype
public interface IPrototype<T> {
    T clone();
}

