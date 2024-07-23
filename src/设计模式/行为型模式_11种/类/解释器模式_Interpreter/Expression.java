package 设计模式.行为型模式_11种.类.解释器模式_Interpreter;

// 抽象表达式：声明解释操作 Expression
interface Expression {

    int interpret(Context context);

}
