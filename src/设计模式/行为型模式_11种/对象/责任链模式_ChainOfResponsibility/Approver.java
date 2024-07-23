package 设计模式.行为型模式_11种.对象.责任链模式_ChainOfResponsibility;

// 抽象处理者：请假审批人 Approver
abstract class Approver {

    protected Approver successor;   // 后继处理者
    protected String name;  // 审批人姓名

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(Request request);   // 处理请求的抽象方法

}
