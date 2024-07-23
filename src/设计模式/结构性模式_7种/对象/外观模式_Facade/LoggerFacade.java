package 设计模式.结构性模式_7种.对象.外观模式_Facade;

// 门面类：日志系统 LoggerFacade
class LoggerFacade {
    private final ConsoleLogger consoleLogger;
    private final FileLogger fileLogger;
    private final DBLogger dbLogger;

    public LoggerFacade() {
        this.consoleLogger = new ConsoleLogger();
        this.fileLogger = new FileLogger();
        this.dbLogger = new DBLogger();
    }

    public void logToConsole(String message) {
        consoleLogger.log(message);
    }

    public void logToFile(String message) {
        fileLogger.log(message);
    }

    public void logToDB(String message) {
        dbLogger.log(message);
    }

    public void log(String message) {
        logToConsole(message);
        logToFile(message);
        logToDB(message);
    }
}

