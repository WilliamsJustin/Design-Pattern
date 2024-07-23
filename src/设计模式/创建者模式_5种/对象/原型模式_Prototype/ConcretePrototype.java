package 设计模式.创建者模式_5种.对象.原型模式_Prototype;

// 定义原型类ConcretePrototype
public class ConcretePrototype implements IPrototype<ConcretePrototype> {
    private String name;

    // 构造函数
    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public ConcretePrototype clone() {
        return new ConcretePrototype(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name=" + name;
    }
}

