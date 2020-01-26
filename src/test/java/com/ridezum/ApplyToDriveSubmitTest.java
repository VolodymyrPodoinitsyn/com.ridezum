package com.ridezum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;

public class ApplyToDriveSubmitTest extends BaseTest {
    @Test
    public void testApplyTpDriveSubmit(){

       homePage = new HomePage(driver);
       applyToDrivePage = homePage.clickApplyToDriveButton();
       driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");
       applyToDrivePage.clickSubmitButton();
        Assert.assertEquals("Please enter a value", applyToDrivePage.valueFieldFirstName());
        Assert.assertEquals("Please enter a value", applyToDrivePage.valueFieldLastName());
        Assert.assertEquals("Please enter a value", applyToDrivePage.valueFieldEmail());
        Assert.assertEquals("Please enter a value", applyToDrivePage.valueFieldPhoneNumber());
        Assert.assertEquals("Please enter a value", applyToDrivePage.valueFieldHomeState());
        Assert.assertEquals("Please enter a value", applyToDrivePage.valueFieldHomeZipCode());


    }
}
