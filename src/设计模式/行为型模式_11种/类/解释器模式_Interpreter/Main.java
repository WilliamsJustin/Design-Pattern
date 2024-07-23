package 设计模式.行为型模式_11种.类.解释器模式_Interpreter;

public class Main {

    public static void main(String[] args) {

        String expression = "1 + 2 + 3";

        Context context = new Context(expression);

        // 构建语法树

        Expression expressionTree = new Plus(
                new Plus(new Number(1), new Number(2)),
                new Number(3)
        );

        // 解释表达式并输出结果
        int result = expressionTree.interpret(context);

        context.setResult(result);

        System.out.println(context.getExpression() + " = " + context.getResult());
    }
}
