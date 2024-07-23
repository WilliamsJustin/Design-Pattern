package 设计模式.行为型模式_11种.对象.责任链模式_ChainOfResponsibility;

// 请求类 Request
class Request {

    private String name;    // 员工姓名
    private int leaveDays;  // 请假天数

    public Request(String name, int leaveDays) {
        this.name = name;
        this.leaveDays = leaveDays;
    }

    public String getName() {
        return name;
    }

    public int getLeaveDays() {
        return leaveDays;
    }
}
