package br.com.matheus.driver;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LocalDriverManager implements IDriver {

    @Override
    public RemoteWebDriver createSession(String browser) {
        RemoteWebDriver driver = null;
        try {
            DriverManagerType driverManagerType = DriverManagerType.valueOf(browser.toUpperCase());
            Class<?> driverClass = Class.forName(driverManagerType.browserClass());
            WebDriverManager.getInstance(driverManagerType).setup();
            driver = (RemoteWebDriver) driverClass.newInstance();
        } catch (IllegalAccessException | ClassNotFoundException | InstantiationException e) {
        }
        return driver;
    }
}