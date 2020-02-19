package br.com.matheus.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BasePage {

    protected WebDriver driver;

    public BasePage() {
        this.driver = new BaseTest().getDriver();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);
    }
}