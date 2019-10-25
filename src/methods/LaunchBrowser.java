package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class LaunchBrowser {
	
	WebDriver webdriver;
	
	public void initializebrowser(String browsername) {
		
		switch(browsername) {
			
			case "Chrome":
				System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
				webdriver = new ChromeDriver();
				webdriver.manage().window().maximize();
				break;
			
			case "Firefox":
				System.setProperty("webdriver.firefox.marionette",".\\driver\\geckodriver.exe");
				webdriver = new FirefoxDriver();
				webdriver.manage().window().maximize();
				break;
				
			case "Opera":
				System.setProperty("webdriver.opera.driver",".\\driver\\operadriver.exe");
				webdriver = new OperaDriver();
				webdriver.manage().window().maximize();
				break;
				
			case "IE":
				System.setProperty("webdriver.ie.driver",".\\driver\\IEDriverServer.exe");
				webdriver = new InternetExplorerDriver();
				webdriver.manage().window().maximize();
				break;
			
			default:
				System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
				webdriver = new ChromeDriver();
				webdriver.manage().window().maximize();
				break;
				
		}
		
	}
	
	
	
	public void navigateto(String url) {
		webdriver.get(url);
	}
	
	public void closetab() {
		webdriver.close();
	}
	
	public void implicitwait(int seconds, TimeUnit unit) {
		webdriver.manage().timeouts().implicitlyWait(seconds,unit);
		webdriver.manage().timeouts().implicitlyWait(seconds,unit);
	}
	
	
}
