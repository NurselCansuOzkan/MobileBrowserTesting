import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;

public class MobileBrowserTesting {


    @Test
    public static void Mobil() throws MalformedURLException , InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "13.0");
        caps.setCapability("deviceName", "Pixel 4 API 33");
        caps.setCapability("browserName", "chrome");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60000);
        caps.setCapability("chromedriverExecutable", "/Users/nurselcansu/IdeaProjects/mobileBrowserTesting/src/driver/chromedriver");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.get("https://www.google.com");
    }
}
