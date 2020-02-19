package br.com.matheus.driver;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class LocalDriverManager implements IDriver {

    @Override
    public WebDriver createInstance(String browser) {
        WebDriver driver = null;

        try {
            DriverManagerType driverManagerType = DriverManagerType.valueOf(browser.toUpperCase());
            Class<?> driverClass = Class.forName(driverManagerType.browserClass());
            WebDriverManager.getInstance(driverManagerType).setup();
            driver = (WebDriver) driverClass.newInstance();
        } catch (IllegalAccessException | ClassNotFoundException e) {
        } catch (InstantiationException e) {
        }
        return driver;
    }
}