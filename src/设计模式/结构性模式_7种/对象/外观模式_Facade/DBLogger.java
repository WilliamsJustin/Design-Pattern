package 设计模式.结构性模式_7种.对象.外观模式_Facade;

// 子系统：输出到数据库DBLogger
class DBLogger {
    public void log(String message) {
        System.out.println("[Database]:" + message);
    }
}

