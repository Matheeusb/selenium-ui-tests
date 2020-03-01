package br.com.matheus.common;

import br.com.matheus.driver.SessionManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import lombok.extern.java.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

@Log
@Listeners(ExtentITestListenerClassAdapter.class)
public class BaseTest {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

    public WebDriver getDriver() {
        return driver.get();
    }

    @BeforeMethod
    @Parameters({"browser", "execution"})
    public void setUp(@Optional("chrome") String browser, @Optional("local") String execution) {
        driver.set(SessionManager.createSession(browser, execution));
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
