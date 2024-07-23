package 设计模式.行为型模式_11种.对象.访问者模式_Visitor;

import java.util.ArrayList;
import java.util.List;

// 对象结构：包含多个英雄和装备道具 ObjectStructure
public class ObjectStructure {

    private List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }

}
