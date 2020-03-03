package br.com.matheus.pages;

import br.com.matheus.common.BasePage;
import br.com.matheus.common.CommonActions;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Getter
public class DocumentationPage extends BasePage {

    @FindBy(id = "webdriver")
    private WebElement titleWebDriverLabel;

    @FindBy(id = "grid")
    private WebElement titleGridLabel;

    @FindBy(id = "search-by")
    private WebElement searchInput;

    @FindBy(xpath = "//a[@href='https://selenium.dev/documentation/en/grid/']")
    private WebElement gridSideMenuItem;

    public DocumentationPage() {
        super();
    }

    public DocumentationPage searchDocumentation(String menuItem) {
        searchInput.sendKeys(menuItem);
        return this;
    }

    public DocumentationPage accessGridDocumentation() {
        fluentWait.until(ExpectedConditions.visibilityOf(gridSideMenuItem)).click();
        return this;
    }
}