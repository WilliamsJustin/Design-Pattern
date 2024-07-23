package 设计模式.创建者模式_5种.对象.抽象工厂模式_AbstractFactory;

// HumanFactory具体工厂（人类工厂）的代码如下：
public class HumanFactory extends RoleFactory {

    @Override
    public Role createRole() {
        return new Human();
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}

