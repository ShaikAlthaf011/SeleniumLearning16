package Codingpractice11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCounterTest2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaclickcounter.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el=driver.findElement(By.cssSelector("button[class*='button']"));
        for(int i=0;i<100;i++){
            el.click();
        }
        WebElement el1=driver.findElement(By.cssSelector("span[class*='counter']"));
        String Str1=el1.getText();
        String Str2="100";
        if(Str1.equals(Str2)){
            System.out.println("Click Counter App: Working as expected");
        }else{
            System.out.println("Mismatch in count");
        }
        driver.quit();
        }
    }

