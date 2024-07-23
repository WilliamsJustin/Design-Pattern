package 设计模式.行为型模式_11种.对象.命令模式_Command;

public class Main {
    public static void main(String[] args) {

        Receiver receiver = new Receiver();

        Command command1 = new TruckCommand(receiver);
        Command command2 = new ShipCommand(receiver);
        Command command3 = new AirplaneCommand(receiver);

        Invoker invoker = new Invoker();
        // 设置卡车命令并执行
        invoker.setCommand(command1);
        invoker.executeCommand();
        invoker.undoCommand();

        // 设置船舶命令并执行
        invoker.setCommand(command2);
        invoker.executeCommand();
        invoker.undoCommand();

        // 设置飞机命令并执行
        invoker.setCommand(command3);
        invoker.executeCommand();
        invoker.undoCommand();

    }
}
