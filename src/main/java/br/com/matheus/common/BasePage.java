package br.com.matheus.common;

import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BasePage {

    protected WebDriver driver;
    protected BaseTest baseTest = new BaseTest();

    public BasePage() {
        this.driver = baseTest.getDriver();
        PageFactory.initElements(new AjaxElementLocatorFactory(baseTest.getDriver(), 5), this);
    }
}