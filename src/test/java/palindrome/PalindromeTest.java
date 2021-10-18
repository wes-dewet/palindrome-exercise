package palindrome;

import base.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PalindromeTest extends BaseTest {

    @Parameters("inputWord")
    @Test
    public void testValidPalindrome(String inputWord){
        palindromePage.setOriginalWord(inputWord);
        palindromePage.clickSubmitButton();
        System.out.println(palindromePage.getPalindromeResult());
        assertEquals(palindromePage.getPalindromeResult(),
                "Yes! " +inputWord+ " reversed is " +inputWord,
                "Palindrome checker failed");

    }
}
