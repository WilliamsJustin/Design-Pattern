package 设计模式.结构性模式_7种.对象.外观模式_Facade;

// 子系统：输出到文件 FileLogger
class FileLogger {
    public void log(String message) {
        System.out.println("[File]:" + message);
    }
}

