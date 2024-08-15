package br.com.matheus.driver;

import lombok.experimental.UtilityClass;
import org.openqa.selenium.remote.RemoteWebDriver;

@UtilityClass
public class SessionManager {

    private static final String LOCAL = "local";
    private static final String REMOTE = "remote";

    public static RemoteWebDriver createSession(String browser, String execution) {
        return switch (execution.toLowerCase()) {
            case LOCAL -> new LocalDriverFactory().createDriver(browser);
            case REMOTE -> new RemoteDriverFactory().createDriver(browser);
            default ->
                    throw new IllegalStateException(String.format("Unknown %s execution target", execution.toLowerCase().toUpperCase()));
        };
    }
}