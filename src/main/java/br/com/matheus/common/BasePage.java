package br.com.matheus.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected Wait<WebDriver> fluentWait;
    protected Wait<WebDriver> wait;

    public BasePage() {
        this.driver = new BaseTest().getDriver();
        this.fluentWait = CommonActions.fluentWait(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);
    }
}