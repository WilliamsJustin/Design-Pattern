package 设计模式.行为型模式_11种.对象.备忘录模式_Memento;

// 原发器类 TextEditor（文本编辑器）
class TextEditor {
    private String content;

    public TextEditor(String content) {
        this.content = content;
    }

    public void insert(String text) {
        content += text;
    }

    public void delete(int length) {
        content = content.substring(0, content.length() - length);
    }

    public TextMemento save() {
        return new TextMemento(content);
    }

    public void restore(TextMemento memento) {
        content = memento.getContent();
    }

    @Override
    public String toString() {
        return content;
    }
}