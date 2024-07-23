package 设计模式.行为型模式_11种.对象.访问者模式_Visitor;

// 具体元素：英雄角色 Hero
public class Hero implements Element {

    private String name;
    public int attack;

    public Hero(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
