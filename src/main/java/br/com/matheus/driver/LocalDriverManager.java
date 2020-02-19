package br.com.matheus.driver;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.java.Log;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.lang.reflect.InvocationTargetException;

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
        } catch (IllegalAccessException | ClassNotFoundException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            log.warning(e.getMessage());
        }
        return driver;
    }
}