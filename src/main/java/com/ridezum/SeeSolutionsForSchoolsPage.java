package com.ridezum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeeSolutionsForSchoolsPage extends BasePage {

    public SeeSolutionsForSchoolsPage(WebDriver driver){
        super(driver);
    }
    @FindBy(css = "input")
    private List<WebElement> inputFields;

    @FindBy(css = ".m-input.contact-form__input m-dropdown__input.required")
    private WebElement titleSelectionButton;

    @FindBy(css = ".m-dropdown__item")
    private List<WebElement> titleSelectionFields;

    public void firstName(String firstName){
        wait.until(ExpectedConditions.visibilityOfAllElements(inputFields.get(0)));
        inputFields.get(0).sendKeys(firstName);
    }
    public void lastName(String lastName){
        inputFields.get(1).sendKeys(lastName);
    }
    public void schoolName(String schoolName){
        inputFields.get(2).sendKeys(schoolName);
    }
    public void clickTitle(){
        driver.findElement(By.cssSelector(".m-dropdown__wrap")).click();
    }
    public void clickTitleSelection(){
        titleSelectionFields.get(6).click();
    }
    public void email(String email){
        inputFields.get(4).sendKeys(email);
    }
    public void phoneNumber(String phoneNumber){
        inputFields.get(5).sendKeys(phoneNumber);
    }
    public void zipCode(String zipCode){
        inputFields.get(6).sendKeys(zipCode);
    }


}
