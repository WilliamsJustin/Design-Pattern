package 设计模式.行为型模式_11种.类.模板方法模式_TemplateMethod;

// 抽象类：制作咖啡 Coffee
abstract class Coffee {

    // 模板方法：制作咖啡
    public final void makeCoffee() {
        boilWater();    // 加水烧开
        grindCoffee();  // 研磨咖啡豆
        brewCoffee();   // 冲泡咖啡
        pourintoCup();  // 倒入杯子
        addCondiments();    //加入调料
    }

    // 基本操作：将水煮沸
    public void boilWater() {
        System.out.println("将水煮沸。");
    }

    // 基本操作：研磨咖啡豆
    public void grindCoffee() {
        System.out.println("研磨咖啡豆。");
    }

    // 基本操作：倒入杯子
    public void pourintoCup() {
        System.out.println("倒入杯子。");

    }

    // 抽象操作：冲泡咖啡
    public abstract void brewCoffee();

    // 抽象操作：加入调料
    public abstract void addCondiments();
}
