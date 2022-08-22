import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest{

    @Test
    public void inputsChars() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        String value;
        WebElement element = driver.findElement(By.tagName("input"));
        element.sendKeys("4" + Keys.ARROW_UP);
        value = element.getAttribute("value");
        assertEquals(value, "5", "Value is not correct");
        element.clear();
        element.sendKeys("0" + Keys.ARROW_DOWN);
        value = element.getAttribute("value");
        assertEquals(value, "-1", "Value is not correct");
        element.clear();
        element.sendKeys("0" + Keys.ARROW_UP);
        value = element.getAttribute("value");
        assertEquals(value, "1", "Value is not correct");
        element.clear();
        element.sendKeys("ABCD" + Keys.ARROW_UP + Keys.ARROW_DOWN);
        value = element.getAttribute("value");
        assertEquals(value, "0", "Value is not correct");//в firefox можно ввести буквы

    }

}
