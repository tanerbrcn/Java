package Lesson3Examples.core;

public class FileLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println("FileLogger ile loglama işlemi yapıldı." + data);
    }
}
