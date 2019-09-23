package pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class main {
	public WebDriver driver;
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports extend;
	public static ExtentTest test;
	static String projectpath = System.getProperty("user.dir");

	@BeforeSuite
	public void beforeworking() {
		htmlreporter = new ExtentHtmlReporter("ExtentReporter.html");
		extend = new ExtentReports();
		extend.attachReporter(htmlreporter);


	}
	@BeforeMethod
	public void browserchecking() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://starsperformer.com/");
		driver.manage().window().maximize();
		String expectedtitle ="Starsperformer || SDET Training in Coimbatore | SDET Training Institutes in Coimbatore | Automation Testing Courses in Coimbatore | Software Training Institutes in Coimbatore";
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("Title Checked");
	}
	
	@AfterMethod
	public void aftermethod() {
	
		driver.quit();
	}
	@AfterSuite
	public void afterwork() {
		
		extend.flush();
		//driver.quit();
	}


}

