package br.com.matheus.pages;

import br.com.matheus.common.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class DocumentationPage extends BasePage {

    @FindBy(id = "webdriver")
    private WebElement titleLabel;

    @FindBy(id = "search-by")
    private WebElement searchInput;

    @FindBy(xpath = "//a[@href='https://selenium.dev/documentation/en/grid/']")
    private WebElement gridSideMenuItem;

    @FindBy(xpath = "//div[@id='body-inner']/p[1]")
    private WebElement firstParagraphLabel;

    public DocumentationPage() {
        super();
    }

    public DocumentationPage searchDocumentation(String menuItem) {
        searchInput.sendKeys(menuItem);
        return this;
    }

    public DocumentationPage accessGridDocumentation() {
        gridSideMenuItem.click();
        return this;
    }
}