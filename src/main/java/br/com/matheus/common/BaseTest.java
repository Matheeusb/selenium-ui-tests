package br.com.matheus.common;

import br.com.matheus.driver.DriverFactory;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import lombok.extern.java.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

@Log
@Listeners(ExtentITestListenerClassAdapter.class)
public class BaseTest {

    protected static final ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

    public WebDriver getDriver() {
        return driver.get();
    }

    @BeforeMethod
    @Parameters({"browser", "execution"})
    public void setUp(@Optional("iexplorer") String browser, @Optional("local") String execution) {
        driver.set(DriverFactory.createSession(browser, execution));
        getDriver().get("https://www.selenium.dev/");
        getDriver().manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }

    @AfterClass
    public void terminate() {
        driver.remove();
    }
}
