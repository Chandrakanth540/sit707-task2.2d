package sit707_week2;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumOperations {

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void officeworks_registration_page(String url) throws IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\VE\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);

        WebElement firstname = driver.findElement(By.id("firstname"));
        firstname.sendKeys("Chandrakanth");

        WebElement lastname = driver.findElement(By.id("lastname"));
        lastname.sendKeys("Kunapareddy");

        WebElement phoneNumber = driver.findElement(By.id("phoneNumber"));
        phoneNumber.sendKeys("0123456789");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("chandra98au@gmail.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Chandra#89");

        WebElement createbtn = driver.findElement(By.className("ActionButton__StyledButton-r7njn9-0 iJIqgV"));
        createbtn.click();

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./image.png"));

        sleep(2);

        driver.quit();
    }

}
