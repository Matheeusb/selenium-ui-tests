package br.com.matheus.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class DriverSessionConfig {

    private WebDriver driver;

    public WebDriver getDriverCapabilities(String browser) {

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions optionsChrome = new ChromeOptions();
                driver = new ChromeDriver(optionsChrome);
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions optionsFirefox = new FirefoxOptions();
                driver = new FirefoxDriver(optionsFirefox);
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                InternetExplorerOptions optionsIE = new InternetExplorerOptions();
                driver = new InternetExplorerDriver(optionsIE);
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions optionsEdge = new EdgeOptions();
                driver = new EdgeDriver(optionsEdge);
            case "opera":
                WebDriverManager.operadriver().setup();
                OperaOptions optionsOpera = new OperaOptions();
                driver = new OperaDriver(optionsOpera);
        }
        return driver;
    }
}
