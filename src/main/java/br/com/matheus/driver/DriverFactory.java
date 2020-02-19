package br.com.matheus.driver;

import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {

    public static RemoteWebDriver createSession(String browser, String execution) {
        Target target = Target.valueOf(execution.toUpperCase());
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

    enum Target {
        LOCAL, REMOTE
    }
}