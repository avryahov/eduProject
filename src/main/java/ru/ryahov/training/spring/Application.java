package ru.ryahov.training.spring;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Application {
    private Client client;
    private EventLogger eventLogger;

    public void logEvent(String event) {
        String message = event.replaceAll(String.valueOf(client.getId()), client.getName());
        eventLogger.logEvent(message);
    }

    public static void main(String[] args) {
         Application application = new Application();
         application.setClient(new Client(1, "Alex"));
         application.setEventLogger(new EventLogger());
         application.logEvent("Some event for user 1");
    }
}
