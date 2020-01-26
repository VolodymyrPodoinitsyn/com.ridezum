package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ApplyToDrivePage extends BasePage {

    public ApplyToDrivePage(WebDriver driver){
        super(driver);
    }
    @FindBy(css = "input")
    private List<WebElement> inputFields;

    @FindBy(css = "#application_form_applicant_state")
    private WebElement stateSelectionButton;

    @FindBy(css = ".main-menu__link")
    private List<WebElement> applyToDrivePageHeadButton;

    @FindBy(css = ".btn-apply.js-submit.app-apply-button.application-form__submit-button")
    private WebElement submitButton;

    @FindBy(css = ".help-block")
    private List<WebElement> valueFields;


    public void firstName(String firstName){
        wait.until(ExpectedConditions.visibilityOfAllElements(inputFields.get(2)));
        inputFields.get(2).sendKeys(firstName);
    }
    public void lastName(String lastName){
        inputFields.get(3).sendKeys(lastName);
    }
    public void email(String email){
        inputFields.get(4).sendKeys(email);
    }
    public void phoneNumber(String phoneNumber){
        inputFields.get(5).sendKeys(phoneNumber);
    }

// Можем выбирать из выпадающего списка либо по index
    public void selectState(int index){
        wait.until(ExpectedConditions.elementToBeClickable(stateSelectionButton));
        Select select = new Select(stateSelectionButton);
        select.selectByIndex(index);
    }
 // либо по name
    public void selectStateByName(String name){
        wait.until(ExpectedConditions.elementToBeClickable(stateSelectionButton));
        Select select = new Select(stateSelectionButton);
        select.selectByValue(name);
    }
    public void homeZipCode(String homeZipCode){
        inputFields.get(8).sendKeys(homeZipCode);
    }
    public void referralCode(String referralCode){
        inputFields.get(9).sendKeys(referralCode);
    }
    public void clickApplyToDriveButton(){
        wait.until(ExpectedConditions.elementToBeClickable(applyToDrivePageHeadButton.get(0)));
        applyToDrivePageHeadButton.get(0).click();
    }
    public void clickSubmitButton(){
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
    }

    public String valueFieldFirstName(){
        wait.until(ExpectedConditions.visibilityOf(valueFields.get(0)));
        return valueFields.get(0).getText();
    }
    public String valueFieldLastName(){
        return valueFields.get(2).getText();
    }
    public String valueFieldEmail(){
        return valueFields.get(5).getText();
    }
    public String valueFieldPhoneNumber(){
        return valueFields.get(7).getText();
    }
    public String valueFieldHomeState(){
        return valueFields.get(9).getText();
    }
    public String valueFieldHomeZipCode(){
        return valueFields.get(10).getText();
    }






}
