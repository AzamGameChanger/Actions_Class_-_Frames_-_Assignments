package com.codewithazam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFrames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Nested Frames")).click();
        System.out.println(driver.findElements(By.tagName("frameset")).size());
        driver.switchTo().frame(0);
        System.out.println(driver.findElements(By.tagName("frame")).size());
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.cssSelector("#content")).getText());


    }
}
