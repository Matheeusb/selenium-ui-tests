package br.com.matheus.driver;

import lombok.experimental.UtilityClass;
import org.openqa.selenium.remote.RemoteWebDriver;

@UtilityClass
public class DriverFactory {

    private final String LOCAL = "local";
    private final String REMOTE = "remote";

    public static RemoteWebDriver createSession(String browser, String execution) {
        String target = execution.toLowerCase();
        RemoteWebDriver webdriver;

        switch (target) {
            case LOCAL:
                webdriver = new LocalDriverManager().createDriver(browser);
                break;
            case REMOTE:
                webdriver = new RemoteDriverManager().createDriver(browser);
                break;
            default:
                throw new IllegalStateException();
        }

        return webdriver;
    }
}