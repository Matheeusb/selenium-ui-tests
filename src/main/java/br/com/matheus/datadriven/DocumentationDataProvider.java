package br.com.matheus.datadriven;

import lombok.experimental.UtilityClass;
import org.testng.annotations.DataProvider;

@UtilityClass
public class DocumentationDataProvider {

    @DataProvider(name = "documentation")
    public static Object[][] getDocumentationItems() {
        return new Object[][] {
                {"Grid"},
                {"WebDriver"},
                {"Legacy"},
                {"Test Practices"}
        };
    }
}
