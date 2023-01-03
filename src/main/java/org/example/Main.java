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
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\chromedriver_win32\\chromedriver.exe");

//        For laptop
//        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

//        For work PC
//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(4000);

        System.out.println("Start first case");
        driver.findElement(By.cssSelector("[ng-click='customer()']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("userSelect")).click();
        driver.findElement(By.cssSelector("[value='1']")).click();
        driver.findElement(By.cssSelector("[type='submit']")).submit();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[ng-click='deposit()']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[ng-model='amount']")).sendKeys("555");
        driver.findElement(By.cssSelector("[type='submit']")).submit();
        driver.findElement(By.cssSelector("[ng-click='home()']")).click();
        System.out.println("Finish first case\n\n");

        System.out.println("Start second case");
        driver.findElement(By.cssSelector("[ng-click='manager()']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[ng-click='addCust()']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[ng-model='fName']")).sendKeys("Sanjar");
        driver.findElement(By.cssSelector("[ng-model='lName']")).sendKeys("Qosimov");
        driver.findElement(By.cssSelector("[ng-model='postCd']")).sendKeys("7007");
        driver.findElement(By.cssSelector("[type='submit']")).submit();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("[ng-click='home()']")).click();
        System.out.println("Finish second case\n\n");

        System.out.println("Start third case");
        driver.findElement(By.cssSelector("[ng-click='manager()']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[ng-click='showCust()']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[ng-model='searchCustomer']")).sendKeys("Ron");
        driver.findElement(By.cssSelector("[ng-click='deleteCust(cust)']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[ng-click='home()']")).click();
        System.out.println("Finish third case\n\n");

        driver.close();



    }
}