package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CareersPage extends BasePage {

    public CareersPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".m-btn.m-banner__btn")
    private WebElement viewJobsButton;

    public JobsLeverPage clickViewJobsButton(){
        wait.until(ExpectedConditions.elementToBeClickable(viewJobsButton));
        viewJobsButton.click();
        return new JobsLeverPage(driver);

    }
}
