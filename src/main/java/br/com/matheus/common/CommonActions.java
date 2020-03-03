package br.com.matheus.common;

import lombok.experimental.UtilityClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

@UtilityClass
public class CommonActions {

    public static void fluentWait(WebDriver driver, WebElement element) {
        new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(Exception.class)
                .until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return element;
            }
        });
    }
}

