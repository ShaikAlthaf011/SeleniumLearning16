package Codingpractice11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeConventerTest2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91703\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qatimeconverter.ccbp.tech/");
        driver.manage().window().maximize();
        //Test the conversion of hours and minutes to seconds:
        WebElement el1=driver.findElement(By.cssSelector("input[id$='Hours']"));
        el1.sendKeys("2");
        WebElement el2=driver.findElement(By.cssSelector("input[id$='Minutes']"));
        el2.sendKeys("30");
        WebElement el3=driver.findElement(By.cssSelector("button[id='convertBtn']"));
        el3.click();
        WebElement el4=driver.findElement(By.cssSelector("p[class^='converted']"));
        String Str1=el4.getText();
        String Str2="9000s";
        if(Str1.equals(Str2)){
            System.out.println("Conversion Successful");
        }else{
            System.out.println("Conversion Failed");
        }
        el1.clear();
        el2.clear();
        //Test the error case at hours:
        WebElement el6=driver.findElement(By.cssSelector("button[id='convertBtn']"));
        el6.click();
       WebElement el5=driver.findElement(By.cssSelector("p[class^='error']"));
       String Str3=el5.getText();
       String Str4="Please enter a valid number of hours.";
       if(Str3.equals(Str4)){
           System.out.println("Expected Error Message Shown");
       }else{
           System.out.println("Unexpected Error Message Shown");
       }
       //Test the error case at minutes:
        WebElement el7=driver.findElement(By.cssSelector("input[id*='Hours']"));
       el7.sendKeys("1");
       WebElement el8=driver.findElement(By.cssSelector("button[id='convertBtn']"));
       el8.click();
       WebElement el9=driver.findElement(By.cssSelector("p[class*='error']"));
       String Str5=el9.getText();
       String Str6="Please enter a valid number of minutes.";
       if(Str5.equals(Str6)){
           System.out.println("Expected Error Message Shown");
       }else{
           System.out.println("Unexpected Error Message Shown.");
       }
       //Test the conversion of hours and minutes to seconds;
        WebElement el09=driver.findElement(By.cssSelector("input[id*='Minutes']"));
       el09.sendKeys("15");
       WebElement el25=driver.findElement(By.cssSelector("button[id='convertBtn']"));
       el25.click();
       WebElement el26=driver.findElement(By.cssSelector("p[id*='time']"));
       String Str25= el26.getText();
       String Str27="4500s";
       if(Str25.equals(Str27)){
           System.out.println("Conversion Successful");
       }else{
           System.out.println("Conversion Failed");
       }
driver.quit();
    }
}
