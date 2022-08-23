import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckboxesTest extends BaseTest {
    @Test
    public void verifyCheckBoxes() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1 = driver.findElements(By.cssSelector("[type=checkbox]")).get(0);
        boolean isSelected;
        isSelected = checkbox1.isSelected();
        assertFalse(isSelected, "Checkbox 1 should be unselected");
        checkbox1.click();
        isSelected = checkbox1.isSelected();
        assertTrue(isSelected, "Checkbox 1 should be selected");

        WebElement checkbox2 = driver.findElements(By.cssSelector("[type=checkbox]")).get(1);
        isSelected = checkbox2.isSelected();
        assertTrue(isSelected, "Checkbox 2 should be selected");
        checkbox2.click();
        isSelected = checkbox2.isSelected();
        assertFalse(isSelected, "Checkbox 2 should be unselected");
    }
}

