package br.com.matheus.pages;

import br.com.matheus.common.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Getter
public class DocumentationPage extends BasePage {

    @FindBy(css = "div#body-inner > h1")
    private WebElement titleLabel;

    @FindBy(id = "search-by")
    private WebElement searchInput;

    @FindBy(xpath = "//a[@title='Edit this page']")
    private WebElement editThisPageLink;

    public DocumentationPage() {
        super();
    }

    public DocumentationPage searchDocumentation(String menuItem) {
        fluentWait.until(ExpectedConditions.visibilityOf(searchInput)).sendKeys(menuItem);
        return this;
    }

    public DocumentationPage accessDocumentationItem(String item) {
        driver.findElement(By.xpath(String.format("//li[@title='%s']", item))).click();
        return this;
    }

    public DocumentationPage accessGithubSeleniumHQ() {
        editThisPageLink.click();
        driver.switchTo().window()
        return this;
    }
}