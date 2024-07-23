package 设计模式.创建者模式_5种.对象.抽象工厂模式_AbstractFactory;

// 具体产品——Sword类（剑）的代码如下：
public class Sword implements Weapon {
    @Override
    public void use() {
        System.out.println("Using sword");
    }
}
