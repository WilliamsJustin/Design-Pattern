package 设计模式.行为型模式_11种.对象.访问者模式_Visitor;

// 具体元素：装备道具 Equipment
public class Equipment implements Element{

    private String name;
    public int defense;

    public Equipment(String name, int defense) {
        this.name = name;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getDefense() {
        return defense;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
