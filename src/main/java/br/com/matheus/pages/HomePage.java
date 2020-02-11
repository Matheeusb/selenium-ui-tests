package br.com.matheus.pages;

import br.com.matheus.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//nav[@id='navbar']/a[@href='/projects']")
    private WebElement projectsMenuItem;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ProjectsPage accessMenuProjects() {
        projectsMenuItem.click();

        return new ProjectsPage(driver);
    }
}