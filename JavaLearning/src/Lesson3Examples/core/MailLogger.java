package Lesson3Examples.core;

public class MailLogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("MailLogger ile loglama işlemi yapıldı." + data);
    }
}
