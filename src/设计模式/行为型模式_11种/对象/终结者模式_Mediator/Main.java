package 设计模式.行为型模式_11种.对象.终结者模式_Mediator;

public class Main {
    public static void main(String[] args) {

        ChatRoom chatRoom = new GroupChatRoom();

        User user1 = new NormalUser("张三", chatRoom);
        User user2 = new NormalUser("李四", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);

        user1.sendMessage("大家好！");
        user2.sendMessage("你们好！");
    }
}
