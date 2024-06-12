import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ChromeMobileTesting {

    @Test
    public void chromeTesting() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "13.0");
        caps.setCapability("deviceName", "Pixel 4 API 33");
        //caps.setCapability("browserName", "chrome");
        //caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");
        //caps.setCapability("chromedriverExecutable", "/Users/nurselcansu/IdeaProjects/mobileBrowserTesting/src/driver/chromedriver");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com.tr");

        MobileElement logo = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Amazon.com.tr\"]"));
        Assert.assertTrue(logo.isEnabled());
        System.out.println("Anasayfaya ulaşıldı");

        MobileElement girisBtn = driver.findElementByXPath("//android.widget.TextView[@text=\"Giriş Yap ›\"]");
        girisBtn.click();
        System.out.println("Giriş sayfasına ulaşıldı");



    }
}
