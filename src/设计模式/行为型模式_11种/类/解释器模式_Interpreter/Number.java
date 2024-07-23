package 设计模式.行为型模式_11种.类.解释器模式_Interpreter;

// 终结符表达式：数字表达式 Number
class Number implements Expression {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return number;
    }
}
