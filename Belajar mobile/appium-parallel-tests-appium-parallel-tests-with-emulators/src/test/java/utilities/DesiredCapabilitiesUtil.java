package utilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class DesiredCapabilitiesUtil {
    public DesiredCapabilities getDesiredCapabilities(String udid, String platformVersion, String aplikasi, String port) {
        final File classpathRoot = new File(System.getProperty("user.dir"));
        final File appDir = new File(classpathRoot, "");
        final File app = new File(appDir, aplikasi);

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("udid", udid);
        desiredCapabilities.setCapability("platformVersion", platformVersion);
        desiredCapabilities.setCapability("platformName", "Android");
//        desiredCapabilities.setCapability("appPackage", "com.isinolsun.app");
//        desiredCapabilities.setCapability("appActivity", "com.isinolsun.app.activities.SplashActivity");
        desiredCapabilities.setCapability("skipUnlock", "true");
        desiredCapabilities.setCapability("noReset", "false");
        return desiredCapabilities;
    }
}
