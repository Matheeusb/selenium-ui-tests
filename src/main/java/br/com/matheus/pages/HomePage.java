package br.com.matheus.pages;

import br.com.matheus.common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@href='/projects']")
    private WebElement projectsMenuItem;

    @FindBy(xpath = "//a[@href='/documentation']")
    private WebElement documentationMenuItem;

    public HomePage() {
        super();
    }

    public DocumentationPage accessMenuDocumentation() {
        documentationMenuItem.click();
        return new DocumentationPage();
    }
}