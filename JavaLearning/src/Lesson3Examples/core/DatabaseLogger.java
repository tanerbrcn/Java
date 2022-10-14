package Lesson3Examples.core;

public class DatabaseLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println("DatabaseLogger ile loglama işlemi yapıldı." + data);
    }
}
