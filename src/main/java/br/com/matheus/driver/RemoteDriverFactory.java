package br.com.matheus.driver;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class RemoteDriverFactory implements IDriver {

    @Override
    public RemoteWebDriver createDriver(String browser) {
        try {
            return new RemoteWebDriver(new URI("http://localhost:4444/").toURL(), getCapability(browser));
        } catch (MalformedURLException | URISyntaxException e) {
            throw new SessionNotCreatedException("Incorrect selenium grid URL!", e);
        }
    }

    private MutableCapabilities getCapability(String browser) {
        DriverType driverType;

        try {
            driverType = DriverType.valueOf(browser.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.format("Unknown %s browser", browser.toUpperCase()));
        }

        return switch (driverType) {
            case CHROME -> new ChromeOptions();
            case FIREFOX -> new FirefoxOptions();
            case EDGE -> new EdgeOptions();
            case IEXPLORER -> new InternetExplorerOptions();
            case SAFARI -> new SafariOptions();
        };
    }
}