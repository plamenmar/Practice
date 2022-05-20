import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestRunner {
   static  WebDriver driver;
  @BeforeTest
    public  void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }

 @Test
           public  void testRun() throws InterruptedException {

       driver.get("https://www.automationexercise.com/");
       Task1 task1 = new Task1();
       Assert.assertTrue(task1.cartXpath.contains("/")&&task1.cartXpath.contains("//"));
       Assert.assertTrue(task1.homeXpath.contains("text")||task1.homeXpath.contains(".="));
       Assert.assertTrue(task1.productsXpath.contains("contains"));
      Assert.assertTrue( driver.findElement(By.xpath(task1.cartXpath)).isDisplayed());
     Assert.assertTrue( driver.findElement(By.xpath(task1.homeXpath)).isDisplayed());
     Assert.assertTrue( driver.findElement(By.xpath(task1.productsXpath)).isDisplayed());
     Assert.assertTrue( driver.findElement(By.xpath(task1.signUpLoginXpath)).isDisplayed());
     Assert.assertTrue( driver.findElement(By.xpath(task1.testCasesXpath)).isDisplayed());
       Task2 Task2 =  new Task2();

     driver.get("https://demoqa.com/text-box");
     driver.manage().window().maximize();
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("window.scrollBy(0,165)", "");
  Task2.submitForm(driver);

   List<WebElement> outputs = driver.findElements(By.xpath("//div[@id=\"output\"]//p"));
   List<String> expecteds = new ArrayList<String>();
   expecteds.add(Task2.fullName);
        expecteds.add(Task2.email);
   expecteds.add(Task2.address);
   expecteds.add(Task2.permanentAddress);
        for (int i=0;i<outputs.size();i++) {
            String text = outputs.get(i).getText().substring(outputs.get(i).getText().indexOf(":")+1);
            Assert.assertEquals(text,expecteds.get(i));
        }
driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

Task3 task3 = new Task3();
Thread.sleep(500);
task3.sauceLogin(driver);
Assert.assertEquals("PRODUCTS",driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText());

     driver.get("https://www.saucedemo.com/");
     driver.manage().window().maximize();
     Task4 task4 = new Task4();
task4.wrongLogin(driver);
Assert.assertEquals(driver.findElement(By.xpath(task4.returnXpath())).getText(),
        "Epic sadface: Username and password do not match any user in this service");

    }
}
