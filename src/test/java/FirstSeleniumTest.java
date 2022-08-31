import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FirstSeleniumTest {

    public static final String URL_MAIN_PAGE = "";
    public static final String URL_TEST_PAGE = "https://the-internet.herokuapp.com";

    @Test
    public void firstTryTest () {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_TEST_PAGE);
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        int sizeAllLinks = allLinks.size();
        allLinks.get(9).click();

    }

}
