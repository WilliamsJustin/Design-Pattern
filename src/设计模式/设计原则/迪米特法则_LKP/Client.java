package 设计模式.设计原则.迪米特法则_LKP;

// 在使用这些类的时候，我们可以像下面这样来使用：

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        User user1 = new User("user1", Arrays.asList(new Article("title1", "content1")));
        User user2 = new User("user2", Arrays.asList(new Article("title2", "content2"), new Article("title3", "content3")));

        userList.add(user1);
        userList.add(user2);

        UserService userService = new UserService(userList);
        int articleCount = userService.getUserArticleCount("user2");
        System.out.println("Article count of user2:" + articleCount);
    }
}
