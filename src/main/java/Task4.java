import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4 {
   // please find the xpath of  error message that is displayed in the sauce demo login page and return in this method
    public String returnXpath (){

       return "//h3[@data-test='error']";
    }
    // Please try to login the saucedemo website using username java and password selenium
    public void wrongLogin(WebDriver driver){
        WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("java");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("selenium");

        WebElement logIn= driver.findElement(By.xpath("//input[@id='login-button']"));
        logIn.click();

    }


}
