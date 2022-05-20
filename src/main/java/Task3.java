import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3 {
    // UserName for this website is problem_user
    // Password for this website is secret_sauce
   public void sauceLogin(WebDriver driver){
       WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
       userName.sendKeys("problem_user");
       WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
       password.sendKeys("secret_sauce");

       WebElement login= driver.findElement(By.xpath("//input[@type='submit']"));
       login.click();


   }
}
