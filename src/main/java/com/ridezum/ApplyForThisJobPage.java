package com.ridezum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ApplyForThisJobPage extends BasePage {

    public ApplyForThisJobPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "input")
    private List<WebElement> submitYourApplicationFields;

    @FindBy(css = "textarea")
    private WebElement additionalInformationField;

    @FindBy(css = "select")
    private List<WebElement> selectField;

    public void fullNameField(String fullName){
        wait.until(ExpectedConditions.visibilityOfAllElements(submitYourApplicationFields.get(1)));
        submitYourApplicationFields.get(1).sendKeys(fullName);
    }
    public void emailField(String email){
        submitYourApplicationFields.get(2).sendKeys(email);
    }
    public void phoneField(String phone){
        submitYourApplicationFields.get(3).sendKeys(phone);
    }
    public void currentCompanyField(String currentCompany){
        submitYourApplicationFields.get(4).sendKeys(currentCompany);
    }
    public void linkedInURLField(){
        submitYourApplicationFields.get(5).sendKeys("https://translate.google.com/");
    }
    public void portfolioURLField(){
        submitYourApplicationFields.get(6).sendKeys("https://google.com/");
    }
    public void additionalInformation(String additionalInformation){
        additionalInformationField.sendKeys(additionalInformation);
    }
    public void selectGender(int index) {
        wait.until(ExpectedConditions.elementToBeClickable(selectField.get(0)));
        Select select = new Select(selectField.get(0));
        select.selectByIndex(index);
    }
    public void selectRace(int index){
        Select select = new Select(selectField.get(1));
        select.selectByIndex(index);
    }
    public void selectVeteranStatus(int index){
        Select select = new Select(selectField.get(2));
        select.selectByIndex(index);
    }





}
