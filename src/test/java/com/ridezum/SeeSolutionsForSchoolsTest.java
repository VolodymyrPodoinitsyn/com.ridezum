package com.ridezum;

import org.junit.Test;
import org.openqa.selenium.By;

public class SeeSolutionsForSchoolsTest extends BaseTest {

    @Test
    public void testSeeSolutionsForSchools(){

     homePage = new HomePage(driver);
     seeSolutionsForSchoolsPage = homePage.clickSeeSolutionsForSchoolsButton();
     seeSolutionsForSchoolsPage.firstName("Vlad");
     seeSolutionsForSchoolsPage.lastName("Pupkin");
     seeSolutionsForSchoolsPage.schoolName("#35");
     seeSolutionsForSchoolsPage.clickTitle();
     seeSolutionsForSchoolsPage.clickTitleSelection();
     String email = emailGenerator.generator();
     seeSolutionsForSchoolsPage.email(email);
     seeSolutionsForSchoolsPage.phoneNumber("3222233223");
     seeSolutionsForSchoolsPage.zipCode("98005");



    }


}
