import br.com.matheus.common.BaseTest;
import br.com.matheus.pages.DocumentationPage;
import br.com.matheus.pages.HomePage;

import static org.testng.Assert.*;

import org.testng.annotations.Test;


public class ProjectsTest extends BaseTest {

    @Test
    public void validateAccessDocumentationWebDriver() {
        new HomePage(driver).accessMenuProjects()
                .learnMoreWebDriver();

        DocumentationPage documentarion = new DocumentationPage(driver);

        assertEquals(documentarion.getTitleLabel().getText(), "WebDriver");
    }
}
