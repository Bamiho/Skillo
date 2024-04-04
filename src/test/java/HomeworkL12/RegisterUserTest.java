package HomeworkL12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class RegisterUserTest {
    @Test
    public void iSkilloTestRegisterFlow() throws InterruptedException{
        String baseURL = "http://training.skillo-bg.com/users/register";

        WebDriver driver = new ChromeDriver();

        driver.get(baseURL);
        Thread.sleep(1000);

        WebElement fillInUsername = driver.findElement(By.name("username"));
        fillInUsername.sendKeys("usernamefortest");
        Thread.sleep(1000);

        WebElement fillInEmail = driver.findElement(By.xpath("/html/body/app-root/div[2]/app-register/div/div/form/div[2]/input"));
        fillInEmail.sendKeys("test@test.com");
        Thread.sleep(1000);

        WebElement fillInPassword = driver.findElement(By.id("defaultRegisterFormPassword"));
        fillInPassword.sendKeys("Password1234");
        Thread.sleep(1000);

        WebElement fillInConfirmPassword = driver.findElement(By.id("defaultRegisterPhonePassword"));
        fillInConfirmPassword.sendKeys("Password1234");
        Thread.sleep(1000);

        WebElement clickOnSignIn = driver.findElement(By.id("sign-in-button"));
        clickOnSignIn.click();
        Thread.sleep(1000);

        driver.quit();

    }
}
