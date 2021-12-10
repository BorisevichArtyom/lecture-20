package by.itacademy.javaenterprise.borisevich.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SomeApplicationService {
    @Value("${application.name}")
    private String applicationName;

    public String getApplicationName() {
        return applicationName;
    }
}
