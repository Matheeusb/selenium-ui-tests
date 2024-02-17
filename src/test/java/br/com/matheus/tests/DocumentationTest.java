package br.com.matheus.tests;

import br.com.matheus.common.TestRule;
import br.com.matheus.datadriven.DocumentationDataProvider;
import br.com.matheus.pages.DocumentationPage;
import br.com.matheus.pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DocumentationTest extends TestRule {

    @Test(dataProvider = "documentation", dataProviderClass = DocumentationDataProvider.class)
    public void validateDocumentationPage(String searchInput) {
        DocumentationPage documentation = new HomePage()
                .accessMenuDocumentation()
                .accessDocumentationItem(searchInput);

        assertEquals(documentation.getTitleLabel().getText(), searchInput);
    }
}
