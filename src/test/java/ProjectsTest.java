import br.com.matheus.common.BaseTest;
import br.com.matheus.pages.DocumentationPage;
import br.com.matheus.pages.HomePage;

import static org.testng.Assert.*;

import org.testng.annotations.Test;


public class ProjectsTest extends BaseTest {

    @Test
    public void validateAccessDocumentationWebDriver() {
        DocumentationPage documentarion = new HomePage(driver)
                .accessMenuProjects()
                .learnMoreWebDriver();

        assertEquals(documentarion.getTitleLabel().getText(), "WebDriver");
    }
}
