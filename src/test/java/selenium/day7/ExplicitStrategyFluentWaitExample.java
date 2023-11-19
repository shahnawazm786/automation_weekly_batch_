package selenium.day7;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;

public class ExplicitStrategyFluentWaitExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();//
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("adder")).click();
        Wait<WebDriver> fluentWait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .ignoring(NoSuchElementException.class)
                .pollingEvery(Duration.ofMillis(500));
        fluentWait.until(d->d.findElement(By.id("box0")).isDisplayed());
        boolean displayed=driver.findElement(By.id("box0")).isDisplayed();
        if(displayed){
            System.out.println("Displayed");
        }
        else {
            System.out.println("is not displayed");
        }
 }
}
