package 设计模式.行为型模式_11种.对象.命令模式_Command;

// 具体命令：卡车运输命令 TruckCommand
public class TruckCommand implements Command {

    private Receiver receiver;

    public TruckCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.transportByTruck();
    }

    @Override
    public void undo() {
        receiver.undoTransportByTruck();
    }
}
