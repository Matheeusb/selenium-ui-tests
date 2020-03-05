package br.com.matheus.tests;

import br.com.matheus.common.BaseTest;
import br.com.matheus.pages.HomePage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class EditThisPageTest extends BaseTest {

    @Test
    public void validateAccessGithub() {
        new HomePage()
                .accessMenuDocumentation()
                .accessDocumentationItem("Grid")
                .accessGithubSeleniumHQ();

        assertEquals("https://github.com/SeleniumHQ/seleniumhq.github.io/edit/master/docs_source_files/content/grid/_index.en.md", getDriver().getCurrentUrl());
    }
}
