import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenGoogle {
    public static void main(String[] args) {
        // Set Chrome to headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");  // new headless mode from Chrome 109+
        options.addArguments("--window-size=1920,1080");

        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Print the title to verify
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
