package 设计模式.行为型模式_11种.对象.访问者模式_Visitor;

// 抽象元素：英雄和装备道具 Element
public interface Element {

    void accept(Visitor visitor);

}
