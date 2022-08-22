import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTest {

    @Test
    public void dropDownTest() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement element = driver.findElement(By.id("dropdown"));
        Select dropDown = new Select(element);
        List<WebElement> elements = dropDown.getOptions();
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            String options = elements.get(i).getText();
            System.out.println(options);
            dropDown.selectByVisibleText("Option 1");
            boolean isSelected = dropDown.getFirstSelectedOption().isSelected();
            assertTrue(isSelected, "Option is not selected");
            dropDown.selectByVisibleText("Option 2");
            boolean isSelected2 = dropDown.getFirstSelectedOption().isSelected();
            assertTrue(isSelected2, "Option is not selected");
        }
    }

}
