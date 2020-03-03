package br.com.matheus.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Wait;

public class BasePage {

    protected WebDriver driver;
    protected Wait<WebDriver> fluentWait;

    public BasePage() {
        this.driver = new BaseTest().getDriver();
        this.fluentWait = CommonActions.fluentWait(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);
    }
}