package br.com.matheus.common;

import br.com.matheus.driver.DriverSessionConfig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser) {
        driver = new DriverSessionConfig().getDriverCapabilities(browser);
        driver.get("https://selenium.dev/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
