package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JobsLeverApplyPage extends BasePage {

    public JobsLeverApplyPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".postings-btn.template-btn-submit.hex-color")
    private WebElement applyForThisJodButton;

    public ApplyForThisJobPage clickApplyForThisJobButton(){
        wait.until(ExpectedConditions.elementToBeClickable(applyForThisJodButton));
        applyForThisJodButton.click();
        return new ApplyForThisJobPage(driver);
    }

}
