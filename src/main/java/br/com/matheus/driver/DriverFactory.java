package br.com.matheus.driver;

import lombok.experimental.UtilityClass;
import org.openqa.selenium.remote.RemoteWebDriver;

@UtilityClass
public class DriverFactory {

    private final String LOCAL = "local";
    private final String REMOTE = "remote";

    public static RemoteWebDriver createSession(String browser, String execution) {
        String executionTarget = execution.toLowerCase();
        RemoteWebDriver driver;

        switch (executionTarget) {
            case LOCAL -> driver = new LocalDriverManager().createDriver(browser);
            case REMOTE -> driver = new RemoteDriverManager().createDriver(browser);
            default -> throw new IllegalStateException(String.format("unknown %s execution target", executionTarget.toUpperCase()));
        }

        return driver;
    }
}