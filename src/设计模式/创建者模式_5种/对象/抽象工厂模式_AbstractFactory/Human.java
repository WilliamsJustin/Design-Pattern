package 设计模式.创建者模式_5种.对象.抽象工厂模式_AbstractFactory;

// 具体产品——Human类（人类）的代码如下：
public class Human implements Role {
    @Override
    public void attack() {
        System.out.println("Human attacking with sword");
    }
}

