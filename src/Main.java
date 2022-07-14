import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "d:\\Stank\\selenium\\selDriver\\chromedriver.exe");

        test(new ChromeDriver());

    }

    public static void test(WebDriver driver){
        driver.get("https://www.dev.by");

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException exception) {
            //..
        }
        driver.close();
    }
}
