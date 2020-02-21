package br.com.matheus.driver;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.java.Log;
import org.openqa.selenium.remote.RemoteWebDriver;

@Log
public class LocalDriverManager implements IDriver {

    @Override
    public RemoteWebDriver createDriver(String browser) {
        RemoteWebDriver driver = null;
        try {
            DriverManagerType driverManagerType = DriverManagerType.valueOf(browser.toUpperCase());
            Class<?> driverClass = Class.forName(driverManagerType.browserClass());
            WebDriverManager.getInstance(driverManagerType).setup();
            driver = (RemoteWebDriver) driverClass.getConstructor().newInstance();
        } catch (Exception e) {
            log.warning(browser + " is not installed");
        }
        return driver;
    }
}