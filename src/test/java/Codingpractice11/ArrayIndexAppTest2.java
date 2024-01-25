package Codingpractice11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayIndexAppTest2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qanumberindex.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el=driver.findElement(By.cssSelector("p[class*='default-array text-center']"));
        String Str1=el.getText();
        String Str2="[ 17, 31, 77, 20, 63 ]";
        if(Str1.equals(Str2)){
            System.out.println("Default Array Matched");
        }else{
            System.out.println("Mismatch in Default Array");
        }
        //Test the index of the number 48:
        WebElement el2=driver.findElement(By.cssSelector("input[class*='user-input']"));
        el2.sendKeys("48");
        WebElement el3=driver.findElement(By.cssSelector("button[id*='Btn']"));
        el3.click();
        WebElement el4=driver.findElement(By.cssSelector("span[class*='number']"));
        String Str3=el4.getText();
        String Str4="-1";
        if(Str3.equals(Str4)){
            System.out.println("Index matched for the number 48");
        }else{
            System.out.println("Index mismatched for the number 48");
        }
        el2.clear();
        //Test the index of the number 17
        WebElement el7=driver.findElement(By.cssSelector("input[class*='user-input']"));
        el2.sendKeys("17");
        WebElement el8=driver.findElement(By.cssSelector("button[id*='Btn']"));
        el3.click();
        WebElement el9=driver.findElement(By.cssSelector("span[class*='number']"));
        String Str5=el9.getText();
        String Str6="0";
        if(Str5.equals(Str6)){
            System.out.println("Index matched for the number 17");
        }else{
            System.out.println("Index mismatched for the number 17");
        }
        el7.clear();
        //Test the index of the number 77:
        WebElement el10=driver.findElement(By.cssSelector("input[class*='user-input']"));
        el10.sendKeys("77");
        WebElement el11=driver.findElement(By.cssSelector("button[id*='Btn']"));
        el11.click();
        WebElement el12=driver.findElement(By.cssSelector("span[class*='number']"));
        String Str7=el12.getText();
        String Str8="2";
        if(Str7.equals(Str8)){
            System.out.println("Index matched for the number 77");
        }else{
            System.out.println("Index mismatched for the number 77");
        }
        el10.clear();
        //Index mismatched for the number 63:
        WebElement el13=driver.findElement(By.cssSelector("input[class*='user-input']"));
        el13.sendKeys("63");
        WebElement el14=driver.findElement(By.cssSelector("button[id*='Btn"));
        el14.click();
        WebElement el15= driver.findElement(By.cssSelector("span[class*='number"));
        String Str9=el15.getText();
        String Str10="4";
        if(Str9.equals(Str10)){
            System.out.println("Index matched for the number 63");
        }else{
            System.out.println("Index Mismatch for the number 63");
        }
        el13.clear();
        driver.quit();
    }
}
