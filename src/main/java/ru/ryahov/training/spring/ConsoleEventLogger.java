package ru.ryahov.training.spring;

/**
 * @author Aleksandr Rjakhov
 */
public class ConsoleEventLogger implements EventLogger {

    @Override
    public void logEvent(String event) {
        System.out.println(event);
    }
}
