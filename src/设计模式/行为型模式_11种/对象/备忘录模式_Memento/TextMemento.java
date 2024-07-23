package 设计模式.行为型模式_11种.对象.备忘录模式_Memento;

// 备忘录类 TextMenento（文本备忘录）
class TextMemento {
    private final String content;

    public TextMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}