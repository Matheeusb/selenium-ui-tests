package br.com.matheus.driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LocalDriverFactory implements IDriver {

    @Override
    public RemoteWebDriver createDriver(String browser) {
        DriverType driverType;

        try {
            driverType = DriverType.valueOf(browser.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.format("Unknown %s browser", browser.toUpperCase()));
        }

        return switch (driverType) {
            case CHROME -> new ChromeDriver();
            case FIREFOX -> new FirefoxDriver();
            case EDGE -> new EdgeDriver();
            case IEXPLORER -> new InternetExplorerDriver();
            case SAFARI -> new SafariDriver();
        };
    }
}