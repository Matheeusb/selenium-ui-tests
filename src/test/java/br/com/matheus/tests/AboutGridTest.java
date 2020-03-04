package br.com.matheus.tests;

import br.com.matheus.common.BaseTest;
import br.com.matheus.datadriven.DocumentationDataProvider;
import br.com.matheus.pages.DocumentationPage;
import br.com.matheus.pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AboutGridTest extends BaseTest {

    @Test(dataProvider = "documentation", dataProviderClass = DocumentationDataProvider.class)
    public void validateDocumentationAboutGrid(String searchInput) {
        DocumentationPage documentation = new HomePage()
                .accessMenuDocumentation()
                .searchDocumentation(searchInput)
                .accessGridDocumentation();

        assertEquals(documentation.getTitleGridLabel().getText(), searchInput);
    }
}
