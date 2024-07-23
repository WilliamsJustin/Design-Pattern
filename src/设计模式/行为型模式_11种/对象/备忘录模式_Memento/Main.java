package 设计模式.行为型模式_11种.对象.备忘录模式_Memento;

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor("Hello,world!");
        System.out.println(editor);

        UndoManager undoManager = new UndoManager();
        undoManager.save(editor);

        editor.insert("This is a test.");
        System.out.println(editor);
        undoManager.save(editor);

        editor.delete(5);
        System.out.println(editor);
        undoManager.undo(editor);
        System.out.println(editor);

        undoManager.undo(editor);
        System.out.println(editor);
    }
}