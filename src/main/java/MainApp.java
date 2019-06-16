import core.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MainApp {


    public void runLocalChrome(){
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "/Users/martin-pierreroy/Devl/libs/chromedriver");

        RemoteWebDriver driver = new ChromeDriver();


        driver.get("http://www.google.com/xhtml");
        Utils.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Zentelia");
        searchBox.submit();
        Utils.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }


    public void runWinAppDriver(){

    }



//   /Users/martin-pierreroy/Devl/libs

    public static void main(String[] args) {
        MainApp mainapp = new MainApp();
        mainapp.runLocalChrome();

    }

}
