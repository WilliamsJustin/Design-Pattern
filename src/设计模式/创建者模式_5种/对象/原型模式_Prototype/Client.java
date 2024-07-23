package 设计模式.创建者模式_5种.对象.原型模式_Prototype;

// 定义客户端Client
public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("originalA");
        System.out.println("创建原型对象：" + prototype);

        ConcretePrototype cloneType = prototype.clone();
        System.out.println("复制原型对象：" + cloneType);

        cloneType.setName("clone");
        System.out.println("修改复制的原型对象：" + cloneType);
    }
}

