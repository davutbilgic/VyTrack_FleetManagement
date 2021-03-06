package com.vytrack.pages;

import com.vytrack.utilities.ExplicitWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class LoginPage {

   public static void userLogin(WebDriver driver, String username, String password){

        driver.findElement(By.id("prependedInput")).sendKeys(username);
        driver.findElement(By.id("prependedInput2")).sendKeys(password);
        driver.findElement(By.id("_submit")).click();
       ExplicitWaits.loadingWait(driver);
    }

}
