package 设计模式.设计原则.迪米特法则_LKP;

// UserService类的代码如下：

import java.util.List;

public class UserService {
    private List<User> userList;

    public UserService(List<User> userList) {
        this.userList = userList;
    }

    public int getUserArticleCount(String username) {
        User user = findUser(username);
        if (user == null) {
            throw new IllegalArgumentException("User not found" + username);
        }
        return user.getArticleList().size();
    }

    private User findUser(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
