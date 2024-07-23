package 设计模式.行为型模式_11种.对象.访问者模式_Visitor;

// 抽象访问者：修改英雄和装备道具的属性 Visitor
public interface Visitor {

    void visit(Hero hero);
    void visit(Equipment equipment);

}
