package 设计模式.设计原则.迪米特法则_LKP;

// Article类（文章）的代码如下：
public class Article {
    private String title;
    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
