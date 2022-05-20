import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {
    public  String fullName = "Techtorial Academy";
    public String email = "techtorial@techtorialacademy.com";
    public  String address="2200 E Devon";
    public String permanentAddress = "Illinois";
    public void submitForm(WebDriver driver){
        // Please use the instance variables above to send keys to
        // the required fields

        WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys("Techtorial Academy");

        WebElement email= driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("techtorial@techtorialacademy.com");

        WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        address.sendKeys("2200 E Devon");

        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.sendKeys("Illinois");

        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();
    }


}
