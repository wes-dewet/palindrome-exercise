package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.PalindromePage;
import java.util.logging.Logger;
import java.util.logging.Level;


public class BaseTest {

    private WebDriver driver;
    protected PalindromePage palindromePage;

    @BeforeClass
    public void setUp(){
        driver = new HtmlUnitDriver(true);

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.OFF);

        driver.get("https://xndev.com/palindrome");

        palindromePage = new PalindromePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
