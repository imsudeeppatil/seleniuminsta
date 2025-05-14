package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
    
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/virat.kohli");
        driver.manage().window().maximize();
        //driver.quit();
    }
}
