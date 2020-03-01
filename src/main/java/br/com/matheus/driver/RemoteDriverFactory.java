package br.com.matheus.driver;

import io.github.bonigarcia.wdm.DriverManagerType;
import lombok.extern.java.Log;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

@Log
public class RemoteDriverFactory extends DriverFactory {

    @Override
    public RemoteWebDriver createDriver(String browser) {
        RemoteWebDriver remoteWebDriver = null;
        try {
            remoteWebDriver = new RemoteWebDriver(new URL("http://localhost:4444/"), getCapability(browser));
        } catch (MalformedURLException | IllegalArgumentException e) {
            log.warning(e.getMessage());
        }

        return remoteWebDriver;
    }

    private MutableCapabilities getCapability(String browser) {
        MutableCapabilities capabilities;
        DriverManagerType driverManagerType = DriverManagerType.valueOf(browser.toUpperCase());

        switch (driverManagerType) {
            case CHROME -> capabilities = new ChromeOptions();
            case FIREFOX -> capabilities = new FirefoxOptions();
            case OPERA -> capabilities = new OperaOptions();
            case EDGE -> capabilities = new EdgeOptions();
            case IEXPLORER -> capabilities = new InternetExplorerOptions();
            default -> throw new IllegalStateException(String.format("%s has no capabilities implemented!", browser.toUpperCase()));
        }

        return capabilities;
    }
}