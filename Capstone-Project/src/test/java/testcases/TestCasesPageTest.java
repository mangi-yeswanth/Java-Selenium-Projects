package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestCasesPage;

public class TestCasesPageTest extends BaseTest {

    @Test
    public void verifyTestCasesPage() {
        driver.get("https://automationexercise.com");

        TestCasesPage testCasesPage = new TestCasesPage(driver);
        testCasesPage.clickTestCasesMenu();

        String title = testCasesPage.getPageTitle();
        Assert.assertTrue(testCasesPage.isTestCasesPageDisplayed(),"Test Cases page was not displayed! Actual title: " + title);

        getTest().pass("verifyTestCasesPage is passed successfully.");
    }
}
