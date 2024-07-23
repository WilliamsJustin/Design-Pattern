package 设计模式.行为型模式_11种.对象.终结者模式_Mediator;

// 抽象调停者 ChatRoom（聊天室）
abstract class ChatRoom {

    public abstract void addUser(User user);

    public abstract void sendMessage(User user,String message);
}
