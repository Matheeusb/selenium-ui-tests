package br.com.matheus.pages;

import br.com.matheus.common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectsPage extends BasePage {

    @FindBy(xpath = "//div[@class='learn-more webdriver']/span")
    private WebElement learnMoreWebDriverLink;

    public ProjectsPage() {
        super();
    }

    public DocumentationPage learnMoreWebDriver() {
        learnMoreWebDriverLink.click();

        return new DocumentationPage();
    }
}