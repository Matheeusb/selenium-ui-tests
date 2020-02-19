package br.com.matheus.tests;

import br.com.matheus.common.BaseTest;
import br.com.matheus.pages.DocumentationPage;
import br.com.matheus.pages.HomePage;
import org.testng.annotations.Test;

public class AboutGridTest extends BaseTest {

    @Test
    public void validateDocumentationAboutGrid() {
        DocumentationPage documentation = new HomePage()
                .accessMenuDocumentation()
                .searchDocumentation("Grid")
                .accessGridDocumentation();

//        assertTrue(documentation.getFirstParagraphLabel().getText().matches("[a-zA-Z]"));
    }
}