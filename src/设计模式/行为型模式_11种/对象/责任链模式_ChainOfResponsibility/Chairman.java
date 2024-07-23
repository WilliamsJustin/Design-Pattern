package 设计模式.行为型模式_11种.对象.责任链模式_ChainOfResponsibility;

// 具体处理者3：董事长 Chairman
public class Chairman extends Approver {
    public Chairman(String name) {
        super(name);
    }

    @Override
    public void processRequest(Request request) {

        if (request.getLeaveDays() > 10 && request.getLeaveDays() <= 20) {
            System.out.println("董事长 " + name
                    + " 审批了员工 " + request.getName()
                    + " 的请假申请，时间为 " + request.getLeaveDays() + " 天。");
        } else {
            System.out.println("请假申请未通过。");
        }
    }
}
