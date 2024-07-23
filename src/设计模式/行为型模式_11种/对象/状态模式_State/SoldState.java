package 设计模式.行为型模式_11种.对象.状态模式_State;

// 具体状态类 SoldState（已售出状态）
public class SoldState implements State {
    @Override
    public void insertCoin() {
        System.out.println("Please wait,we're already giving you a product.");
    }

    @Override
    public void chooseProduct() {
        System.out.println("Sorry,you already got a product.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("A product is being dispensed.");
    }
}