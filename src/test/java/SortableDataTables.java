import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class SortableDataTables extends BaseTest
{
    @Test
    public void sortData() {
        driver.get("http://the-internet.herokuapp.com/tables");
        String value;
        WebElement table = driver.findElement(By.id("table1"));
        value = table.findElement(By.xpath("//table//tr[1]//td[1]")).getText();
        assertEquals(value, "Smith", "The data is not correct");

        value = table.findElement(By.xpath("//table//tr[2]//td[2]")).getText();
        assertEquals(value, "Frank", "The data is not correct");

        value = table.findElement(By.xpath("//table//tr[3]//td[3]")).getText();
        assertEquals(value, "jdoe@hotmail.com", "The data is not correct");

        value = table.findElement(By.xpath("//table//tr[4]//td[5]")).getText();
        assertEquals(value, "http://www.timconway.com", "The data is not correct");

        value = table.findElement(By.xpath("//table//tr[3]//td[4]")).getText();
        assertEquals(value, "$100.00", "The data is not correct");

    }
}

