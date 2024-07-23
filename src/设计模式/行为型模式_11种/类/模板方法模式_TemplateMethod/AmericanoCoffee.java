package 设计模式.行为型模式_11种.类.模板方法模式_TemplateMethod;

// 具体类1：制作美式咖啡 AmericanoCoffee
public class AmericanoCoffee extends Coffee{
    @Override
    public void brewCoffee() {
        System.out.println("冲泡美式咖啡。");
    }

    @Override
    public void addCondiments() {
        System.out.println("加入糖和牛奶。");
    }
}
