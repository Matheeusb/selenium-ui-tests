package br.com.matheus.pages;

import br.com.matheus.common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//nav[@id='navbar']/a[@href='/projects']")
    private WebElement projectsMenuItem;

    @FindBy(xpath = "//nav[@id='navbar']/a[@href='/documentation']")
    private WebElement documentationMenuItem;

    public HomePage() {
        super();
    }

    public ProjectsPage accessMenuProjects() {
        projectsMenuItem.click();
        return new ProjectsPage();
    }

    public DocumentationPage accessMenuDocumentation() {
        documentationMenuItem.click();
        return new DocumentationPage();
    }
}