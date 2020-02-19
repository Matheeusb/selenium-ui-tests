package br.com.matheus.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {

    public static RemoteWebDriver createInstance(String browser, String execution) {
        Target target = Target.valueOf(execution.toUpperCase());
        RemoteWebDriver webdriver;

        switch (target) {
            case LOCAL:
                webdriver = new LocalDriverManager().createSession(browser);
                break;
            case REMOTE:
                webdriver = new RemoteDriverManager().createSession(browser);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + target);
        }

        return webdriver;
    }

    enum Target {
        LOCAL, REMOTE
    }
}