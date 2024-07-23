package 设计模式.行为型模式_11种.对象.命令模式_Command;

// 具体命令：船舶运输命令 ShipCommand
public class ShipCommand implements Command {

    private Receiver receiver;

    public ShipCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.transportByShip();
    }

    @Override
    public void undo() {
        receiver.undoTransportByShip();
    }
}
