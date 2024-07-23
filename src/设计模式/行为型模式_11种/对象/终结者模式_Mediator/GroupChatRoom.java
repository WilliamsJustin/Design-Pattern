package 设计模式.行为型模式_11种.对象.终结者模式_Mediator;

import java.util.ArrayList;
import java.util.List;

// 具体调停者 GroupChatRoom
public class GroupChatRoom extends ChatRoom {

    private List<User> userList = new ArrayList<>();

    @Override
    public void addUser(User user) {
        userList.add(user);
    }

    @Override
    public void sendMessage(User sender, String message) {
        for (User user : userList) {
            if (!user.getName().equals(sender.getName())) {
                user.receiveMessage(sender, message);
            }
        }
    }
}
