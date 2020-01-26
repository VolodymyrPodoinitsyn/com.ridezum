package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class JobsLeverPage extends BasePage {

    public JobsLeverPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".posting-btn-submit.template-btn-submit.hex-color")
    private List<WebElement> applyButton;

    public JobsLeverApplyPage clickApplyTechnicalButton(){
       wait.until(ExpectedConditions.elementToBeClickable(applyButton.get(0)));
       applyButton.get(0).click();
       return new JobsLeverApplyPage(driver);
    }

}
