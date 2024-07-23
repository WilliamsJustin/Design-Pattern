package 设计模式.行为型模式_11种.对象.命令模式_Command;

// 抽象命令 Command
interface Command {

    void execute();

    void undo();

}
