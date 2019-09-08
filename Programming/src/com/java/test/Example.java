package com.java.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 import java.lang.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
 
public class Example  {
  public static void main(String[] args) {
 
    // Create an instance of the driver
    WebDriver driver = new FirefoxDriver();
 
    // Navigate to a web page
    driver.get("http://www.google.com");
 
    // Perform actions on HTML elements, entering text and submitting the form
driver.quit();    
 
  }
}