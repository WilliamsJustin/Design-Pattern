package 设计模式.行为型模式_11种.对象.责任链模式_ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {

        // 创建责任链
        Approver departmentManager = new DepartmentManager("张三");
        Approver generalManager = new GeneralManager("李四");
        Approver chairman = new Chairman("王五");

        departmentManager.setSuccessor(generalManager);
        generalManager.setSuccessor(chairman);

        // 创建请求
        Request request1 = new Request("小明", 3);
        Request request2 = new Request("小张", 8);
        Request request3 = new Request("小王", 15);
        Request request4 = new Request("小李", 25);

        // 处理请求
        departmentManager.processRequest(request1);
        departmentManager.processRequest(request2);
        departmentManager.processRequest(request3);
        departmentManager.processRequest(request4);
    }
}
