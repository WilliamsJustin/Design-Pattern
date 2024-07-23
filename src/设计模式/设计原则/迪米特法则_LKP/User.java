package 设计模式.设计原则.迪米特法则_LKP;

// User类（用户）的代码如下：

import java.util.List;

public class User {
    private String username;
    private List<Article> articleList;

    public User(String username, List<Article> articleList) {
        this.username = username;
        this.articleList = articleList;
    }

    public String getUsername() {
        return username;
    }

    public List<Article> getArticleList() {
        return articleList;
    }
}
