package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start autotests!\n");

//        For home PC
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\chromedriver_win32\\chromedriver.exe");

//        For work PC
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(5000);

        System.out.println("Start first case");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div/select")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div/select/option[2]")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/strong")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div[1]/button[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div[1]/button[1]")).click();
        Thread.sleep(5000);
        System.out.println("First case was successfully\n");

        System.out.println("Start second");




//        driver.close();



    }
}