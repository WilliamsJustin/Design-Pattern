package 设计模式.行为型模式_11种.对象.备忘录模式_Memento;    // 负责人类 UndoManager

import java.util.Stack;

// 负责人类 UndoManager
class UndoManager {
    private Stack<TextMemento> stack = new Stack<>();

    public void save(TextEditor editor) {
        stack.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!stack.isEmpty()) {
            editor.restore(stack.pop());
        }
    }
}