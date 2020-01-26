package com.ridezum;

import org.junit.Test;
import org.openqa.selenium.By;

public class ApplyToDriveTest extends BaseTest {

    @Test
    public void testApplyToDrive(){

       homePage = new HomePage(driver);
       applyToDrivePage = homePage.clickApplyToDriveButton();
        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));
        applyToDrivePage.firstName("Vlad");
        applyToDrivePage.lastName("Pupkin");
        String email = emailGenerator.generator();
        applyToDrivePage.email(email);
        applyToDrivePage.phoneNumber("(322) 223-3222");

        applyToDrivePage.selectState(3);
//        applyToDrivePage.selectStateByName("California");или по имени
        applyToDrivePage.homeZipCode("98005");
        applyToDrivePage.referralCode("3151020");
        driver.switchTo().defaultContent();
        applyToDrivePage.clickApplyToDriveButton();

    }
}
