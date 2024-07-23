package 设计模式.创建者模式_5种.对象.抽象工厂模式_AbstractFactory;

// RoleFactory抽象工厂（角色工厂）的代码如下：
public abstract class RoleFactory {
    public abstract Role createRole();

    public abstract Weapon createWeapon();
}

