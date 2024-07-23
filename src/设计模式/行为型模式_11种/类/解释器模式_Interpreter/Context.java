package 设计模式.行为型模式_11种.类.解释器模式_Interpreter;

// 上下文：包含解释器所需要的一些全局信息 Context
class Context {

    private String expression;
    private int result;

    public Context(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }
}
