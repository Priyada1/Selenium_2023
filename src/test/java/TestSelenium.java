import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium {



    @Test
    public void ChromeDriverSetUptest()
    {
        System.out.print("passed");
        System.setProperty("webdriver.chrome.driver","/Users/Priyadarshi/Desktop/Selenium/Selenium_2023/src/server/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        //driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("vivo s1 pro");
        driver.findElement(By.id("nav-search-submit-button")).click();

        driver.close();

    }

    @Test(enabled = false)
    public void FirefoxDriverSetUptest()
    {
        System.out.print("passed");
        System.setProperty("webdriver.gecko.driver","/Users/Priyadarshi/Desktop/Selenium/src/server/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.geeksforgeeks.org/count-occurrences-of-anagrams/");
        driver.manage().window().maximize();
        driver.close();
    }
}
