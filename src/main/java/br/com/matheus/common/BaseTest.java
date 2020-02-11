package br.com.matheus.common;

import br.com.matheus.driver.DriverManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;

@Listeners(ExtentITestListenerClassAdapter.class)
public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser) {
        driver = new DriverManager().getDriver(browser);
        driver.get("https://selenium.dev/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
