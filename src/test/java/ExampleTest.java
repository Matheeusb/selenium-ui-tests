import br.com.matheus.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ExampleTest extends BaseTest {

    @Test
    public void validaExemplo() {
        driver.findElement(By.name("relaxation")).sendKeys("94965-405");
        driver.findElement(By.xpath("//*[@id=\"Geral\"]/div/div/div[6]/input")).click();

        WebElement rua = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]"));
        WebElement bairro = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));

        assertEquals(rua.getText(), "Rua Bento Gonçalves ");
        assertEquals(bairro.getText(), "Parque Espírito Santo ");
    }
}
