import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest{

    @Test
    public void addRemoveElements() {
        driver.get("http://the-internet.herokuapp.com/typos");
        WebElement element = driver.findElements(By.tagName("p")).get(1);
        String  text = element.getText();
        assertEquals(text,"Sometimes you'll see a typo, other times you won't.",
                "Text is wrong");
    }

}
