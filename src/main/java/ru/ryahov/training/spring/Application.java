package ru.ryahov.training.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Application {
    private Client client;
    private EventLogger eventLogger;

    public void logEvent(String event) {
        String message = event.replaceAll(String.valueOf(client.getId()), client.getName());
        eventLogger.logEvent(message);
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig.xml");
        Application application = applicationContext.getBean("app", Application.class);
        application.logEvent("Some event for user 1");
    }
}
