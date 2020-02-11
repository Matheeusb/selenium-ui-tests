package br.com.matheus.pages;

import br.com.matheus.common.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class DocumentationPage extends BasePage {

    @FindBy(id = "webdriver")
    private WebElement titleLabel;

    public DocumentationPage(WebDriver driver) {
        super(driver);
    }
}