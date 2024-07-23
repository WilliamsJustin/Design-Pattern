package 设计模式.行为型模式_11种.类.解释器模式_Interpreter;

// 非终结符表达式：加法表达式 Plus
class Plus implements Expression {

    private Expression left, right;

    public Plus(Expression left, Expression right) {

        this.left = left;
        this.right = right;

    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
