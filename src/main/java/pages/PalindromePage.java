package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PalindromePage {

    private WebDriver driver;
    private By originalWordField = By.id("originalWord");
    private By submitButton = By.id("button1");
    private By palindromeResultMessage = By.id("palindromeResult");

    public PalindromePage(WebDriver driver){
        this.driver = driver;
    }

    public void setOriginalWord(String originalWord){
        driver.findElement(originalWordField).sendKeys(originalWord);
    }

    public void clickSubmitButton(){

        driver.findElement(submitButton).click();
    }

    public String getPalindromeResult(){

        return driver.findElement(palindromeResultMessage).getText();
    }
}
