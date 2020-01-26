package com.ridezum;

import org.junit.Test;

public class ApplyJobsLeverTest extends BaseTest {

    @Test
    public void testApplyJobsLever(){

       homePage = new HomePage(driver);
       careersPage = homePage.clickCareersPage();
       jabsLeverPage = careersPage.clickViewJobsButton();
       String windowHandleBefore = driver.getWindowHandle();
       for (String winHandle : driver.getWindowHandles()){
           driver.switchTo().window(winHandle);
       }
       jobsLeverApplyPage = jabsLeverPage.clickApplyTechnicalButton();
       applyForThisJobPage = jobsLeverApplyPage.clickApplyForThisJobButton();
       applyForThisJobPage.fullNameField("Vlad Pupkin");
       String email = emailGenerator.generator();
       applyForThisJobPage.emailField(email);
       applyForThisJobPage.phoneField("3222233223");
       applyForThisJobPage.currentCompanyField("Redizum");
       applyForThisJobPage.linkedInURLField();
       applyForThisJobPage.portfolioURLField();
       applyForThisJobPage.additionalInformation("Hi my name is Vlad");
       applyForThisJobPage.selectGender(1);
       applyForThisJobPage.selectRace(2);
       applyForThisJobPage.selectVeteranStatus(2);






    }
}
