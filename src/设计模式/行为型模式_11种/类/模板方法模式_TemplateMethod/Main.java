package 设计模式.行为型模式_11种.类.模板方法模式_TemplateMethod;

public class Main {
    public static void main(String[] args) {

        Coffee americanoCoffee = new AmericanoCoffee();
        americanoCoffee.makeCoffee();

        System.out.println();

        Coffee latteCoffee = new LatteCoffee();
        latteCoffee.makeCoffee();

    }
}
