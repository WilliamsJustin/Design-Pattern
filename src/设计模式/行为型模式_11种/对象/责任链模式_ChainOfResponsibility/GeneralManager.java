package 设计模式.行为型模式_11种.对象.责任链模式_ChainOfResponsibility;

// 具体处理者2：总经理 GeneralManager
public class GeneralManager extends Approver {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void processRequest(Request request) {

        if (request.getLeaveDays() > 5 && request.getLeaveDays() <= 10) {
            System.out.println("总经理 " + name
                    + " 审批了员工 " + request.getName()
                    + " 的请假申请，时间为 " + request.getLeaveDays() + " 天。");
        } else {
            if (successor != null) {
                successor.processRequest(request);
            }
        }
    }
}
