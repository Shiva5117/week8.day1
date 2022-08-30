package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadDataExcel;

public class ProjectSpecificMethods {
	
	//public static ChromeDriver driver;
	private static final ThreadLocal<RemoteWebDriver> remoteWebDriver = new ThreadLocal<RemoteWebDriver>();
	public static String leadId;
	
	public void setDriver() {
		remoteWebDriver.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver() {
		return remoteWebDriver.get();
	}
	public String excelName = "";
	
	@DataProvider(name="fetchdata")
	public String[][] fetchData() throws IOException {
		String[][] data = ReadDataExcel.readData(excelName);
		return data;
	}

	@BeforeMethod
	public void callMethod() {
		WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		setDriver();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void closeBrowser() {
		getDriver().close();
	}

}
