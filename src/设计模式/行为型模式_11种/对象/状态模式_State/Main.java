package 设计模式.行为型模式_11种.对象.状态模式_State;

public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine(new NoCoinState());
        vendingMachine.insertCoin();
        vendingMachine.chooseProduct();
        vendingMachine.dispenseProduct();

        vendingMachine.setState(new HasCoinState());
        vendingMachine.insertCoin();
        vendingMachine.chooseProduct();
        vendingMachine.dispenseProduct();

        vendingMachine.setState(new SoldState());
        vendingMachine.insertCoin();
        vendingMachine.chooseProduct();
        vendingMachine.dispenseProduct();

    }
}