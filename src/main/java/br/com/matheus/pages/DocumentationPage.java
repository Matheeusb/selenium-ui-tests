package br.com.matheus.pages;

import br.com.matheus.common.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Getter
public class DocumentationPage extends BasePage {

    @FindBy(xpath = "//h1")
    private WebElement titleLabel;

    public DocumentationPage() {
        super();
    }

    public DocumentationPage accessDocumentationItem(String item) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(
                By.xpath(String.format("//a[@href='/documentation/%s/']", item.toLowerCase().replace(" ", "_")))))).click();
        return this;
    }
}