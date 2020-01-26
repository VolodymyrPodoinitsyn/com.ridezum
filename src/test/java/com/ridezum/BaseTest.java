package com.ridezum;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;
    protected HomePage homePage;
    protected ApplyToDrivePage applyToDrivePage;
    protected static EmailGenerator emailGenerator;
    protected SeeSolutionsForSchoolsPage seeSolutionsForSchoolsPage;
    protected CareersPage careersPage;
    protected JobsLeverPage jabsLeverPage;
    protected JobsLeverApplyPage jobsLeverApplyPage;
    protected ApplyForThisJobPage applyForThisJobPage;



//    @Test
//      public void testBase(){


    @BeforeClass
    public static void start(){

        System.setProperty("webdriver.chrome.driver", "/Users/vladimirpodoinitsyn/Desktop/chromedriver");

        driver = new ChromeDriver();

        driver.manage().window().fullscreen();

        driver.get("https://ridezum.com/");

        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);

        String expectedTitle = "Zūm";

        Assert.assertEquals(expectedTitle, actualTitle);

        emailGenerator = new EmailGenerator();
    }
//    @AfterClass
//    public static void finish(){
//        driver.quit();
//    }


}
