package taudemo;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SeleniumTest {

    private WebDriver driver;

    @BeforeAll
    public void BeforeTests(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void openTheComPageAndCheckTitle(){
        String ExpectedComTitle = "Example Domain";
        driver.get("https://www.example.com");
        assertEquals(ExpectedComTitle,driver.getTitle());
    }

    @Test
    public void openTheOrgPageAndCheckTitle(){
        String expectedOrgTitle = "Example Domain";
        driver.get("https://www.example.org");
        assertEquals(expectedOrgTitle,driver.getTitle());
        driver.get("https://www.eltiempo.com");
    }

    @AfterAll
    public void AfterTests(){
        driver.quit();
    }
}
