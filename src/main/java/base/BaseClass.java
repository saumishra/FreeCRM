package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {
	
	public static Properties prop;
	public static WebDriver webDriver;
	String basePath = System.getProperty("user.dir");
	
	public BaseClass() {
	
	try {
		prop = new Properties();
		FileInputStream fs = new FileInputStream(basePath+"/src/main/java/config/config.properties");
		prop.load(fs);
	}
	catch (FileNotFoundException e){
		e.printStackTrace();
		}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	@BeforeSuite	
	public void testInit() {
		
		String browser = prop.getProperty("browserName");
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",basePath+"/src/main/resource/chromedriver");
			webDriver = new ChromeDriver();
			System.out.println(prop.getProperty("baseURL"));

		}
	
		  	webDriver.manage().window().maximize();
	        webDriver.manage().deleteAllCookies();
	        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}


}
