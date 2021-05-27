package taudemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class WithConfigurationTest {

    private WebDriver driver;

    @BeforeAll
    public void BeforeAllTest(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void justATest(){
        String expectedOrgTitle = "Example Title";
        driver.get("https://www.example.org");
        assertEquals(expectedOrgTitle,driver.getTitle());
    }

    @AfterAll
    public void AfterTests(){
        driver.quit();
    }
}
