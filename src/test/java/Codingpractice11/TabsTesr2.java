package Codingpractice11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TabsTesr2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qatabs.ccbp.tech/");
        driver.manage().window().maximize();
        //TestCaseAbout:1
        String Homepage="https://qatabs.ccbp.tech/";
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(Homepage));
        WebElement element1=driver.findElement(By.cssSelector("button[id^='about']"));
        element1.click();
        WebElement element2= driver.findElement(By.cssSelector("p[id^='about']"));
        String Str1=element2.getText();
        String Str2="Varanasi is one of the oldest living cities in the world. Its Prominence in Hindu mythology is virtually unrevealed. Mark Twain, the English author and literature, who was enthralled by the legend and sanctity of Benaras, once wrote, \"Benaras is older than history, older than tradition, older even than legend and looks twice as old as all of them put together\".";
       if(Str1.equalsIgnoreCase(Str2)){
           System.out.println("About Content Matched");
       }else{
           System.out.println("Mismatch in the 'About' Content");
       }
       //TestCaseTimeTo visitContent:2
      WebElement element3=driver.findElement(By.cssSelector("button[id^='time']"));
       element3.click();
      WebElement element4=driver.findElement(By.cssSelector("p[id^='time']"));
      String Str3=element4.getText();
      String Str4="October to March is the best time to visit Varanasi because most of the fairs here are held during this time of the year. Festivities begin with Diwali and continue to Dev Diwali celebrated on the 15th day from Diwali. In between, there is also Annakut. During this time, the ghats are lit with lights and diyas. Earthen lamps adorn the staircase of the ghats and are also afloat in the river. Firecrackers burn through the night, and it's a sight no one should miss.";
      if(Str3.equalsIgnoreCase(Str4)){
          System.out.println("Time to Visit Content Matched");
      }else{
          System.out.println("Time to Visit' Content");
      }
      //TestCaseTimetovisit:3
        WebElement element5= driver.findElement(By.cssSelector("button[id^='attraction']"));
      element5.click();
      WebElement element6=driver.findElement(By.cssSelector("p[id^='attraction']"));
      String Str5=element6.getText();
      String Str6="When visiting Varanasi, one comes across plenty of ghats, but among them, Dashashwamedh Ghat is said to be one of the oldest and most important. This ghat, leading to the Ganges, is located close to the famous old Vishwanath temple in Kashi (today’s Banaras). Another famous attraction is River Ganges which is the holiest river by the Hindus and many more.";
      if(Str5.equals(Str6)){
          System.out.println("Attractions Content Matched");
      }else{
          System.out.println("Attractions' Content");
      }
      driver.quit();
    }
}
