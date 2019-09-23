package pageobject;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Set;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import org.openqa.selenium.support.PageFactory;

public class performermethod extends main{

	private WebDriver driver=null;

	//header logo
	@FindBy(how=How.XPATH,using="./html/body/div[1]/header/div/a/img")
	WebElement header_logo;

	//home page
	@FindBy(how = How.XPATH, using = ".//*[@id=\'navbar-collapse-1\']/ul/li[1]/a")
	WebElement home_link;
	@FindBy(how = How.XPATH,using = ".//*[@id=\'main-banner-slider\']/ul/li[1]/div[4]/div/div/div/a")
	WebElement home_box;

	//about page
	@FindBy(how =How.XPATH,using =".//*[@id=\'navbar-collapse-1\']/ul/li[2]/a")
	WebElement about_link;
	@FindBy(how=How.XPATH,using =".//*[@id=\'about-us\']/div/div[1]/h2")
	WebElement about_h2;
	@FindBy(how =How.XPATH,using =".//*[@id=\'about-us\']/div/div[1]/p")
	WebElement about_p;
	@FindBy(how=How.XPATH,using=".//*[@id=\'about-us\']/div/div[2]/div[1]/div/div")
	WebElement about_agile;
	@FindBy(how=How.XPATH,using=".//*[@id=\'about-us\']/div/div[2]/div[1]/div/p")
	WebElement about_agile_p;
	@FindBy(how=How.XPATH,using=".//*[@id=\'about-us\']/div/div[2]/div[2]/div/div")
	WebElement about_artificial;
	@FindBy(how =How.XPATH,using=".//*[@id=\'about-us\']/div/div[2]/div[2]/div/p")
	WebElement about_artificial_p;
	@FindBy(how =How.XPATH,using=".//*[@id=\'about-us\']/div/div[2]/div[3]/div/div")
	WebElement about_soft;
	@FindBy(how=How.XPATH,using=".//*[@id=\'about-us\']/div/div[2]/div[3]/div/p")
	WebElement about_soft_p;
	@FindBy(how=How.XPATH,using=".//*[@id=\'about-us\']/div/div[2]/div[4]/div/div")
	WebElement about_leader;
	@FindBy(how=How.XPATH,using="//*[@id=\'about-us\']/div/div[2]/div[4]/div/p")
	WebElement about_leader_p;

	//service

	@FindBy(how=How.XPATH,using=".//*[@id=\'navbar-collapse-1\']/ul/li[3]/a")
	WebElement service_link;
	@FindBy(how=How.XPATH,using=".//*[@id=\'service-section\']/div/div/div/div[1]/h2")
	WebElement service_h2;
	@FindBy(how=How.XPATH,using=".//*[@id=\'service-section\']/div/div/div/div[1]/p")
	WebElement service_p;
	@FindBy(how=How.XPATH,using=".//*[@id=\'service-section\']/div/div/div/div[2]/div[1]/div")
	WebElement service_ipcoe;
	@FindBy(how=How.XPATH,using="./html//div[@id='service-section']/div[@class='page-middle-banner']/div[@class='opacity']//div[@class='row']/div[1]/div[@class='single-service-content']/p")
	WebElement service_ipcoe_p;
	@FindBy(how=How.XPATH,using=".//*[@id=\'service-section\']/div/div/div/div[2]/div[2]/div")
	WebElement service_interactive;
	@FindBy(how=How.XPATH,using=".//*[@id=\'service-section\']/div/div/div/div[2]/div[2]/div/p")
	WebElement service_interactive_p;
	@FindBy(how=How.XPATH,using=".//*[@id=\'service-section\']/div/div/div/div[2]/div[3]/div")
	WebElement service_technical;
	@FindBy(how=How.XPATH,using=".//*[@id=\'service-section\']/div/div/div/div[2]/div[3]/div/p")
	WebElement service_technical_p;


	//clients

	@FindBy(how=How.XPATH,using=".//*[@id=\'navbar-collapse-1\']/ul/li[5]/a")
	WebElement client_link;
	@FindBy(how=How.XPATH,using=".//*[@id=\'our-client\']/div/div[1]/h2")
	WebElement client_h2;
	@FindBy(how=How.XPATH,using=".//*[@id=\'our-client\']/div/div[2]/div[2]/div/div[2]/h4")
	WebElement client_h4;
	@FindBy(how=How.XPATH,using=".//*[@id=\'our-client\']/div/div[2]/div[2]/div/div[1]/img")
	WebElement client_img;
	@FindBy(how=How.XPATH,using="./html/body/div[1]/div[6]/div/h3")
	WebElement client_h3;

	//Program duration

	@FindBy(how=How.XPATH,using=".//*[@id=\'navbar-collapse-1\']/ul/li[6]/a")
	WebElement pro_duration_link;
	@FindBy(how=How.XPATH,using=".//*[@id=\'pricing-section\']/div[2]/div/div[1]/div")
	WebElement pro_trannie_sdet;
	@FindBy(how=How.XPATH,using=".//*[@id=\'pricing-section\']/div[2]/div/div[1]/div/strong")
	WebElement pro_trannie_clr;
	@FindBy(how=How.XPATH,using="//*[@id=\'pricing-section\']/div[2]/div/div[1]/div/ul/li[1]")
	WebElement pro_trannie_qua;
	@FindBy(how=How.XPATH,using=".//*[@id=\'pricing-section\']/div[2]/div/div[1]/div/ul/li[2]")
	WebElement pro_trannie_pre;
	@FindBy(how=How.XPATH,using=".//*[@id=\'pricing-section\']/div[2]/div/div[1]/div/ul/li[3]")
	WebElement pro_trannie_duration;
	@FindBy(how=How.XPATH,using=".//*[@id=\'pricing-section\']/div[2]/div/div[1]/div/ul/li[4]")
	WebElement pro_trannie_month;

	@FindBy(how=How.XPATH,using=".//*[@id=\'pricing-section\']/div[2]/div/div[2]/div")
	WebElement pro_junior_sdet;
	@FindBy(how=How.XPATH,using=".//*[@id=\'pricing-section\']/div[2]/div/div[2]/div/strong")
	WebElement pro_junior_clr;

	//Blog

	@FindBy(how=How.XPATH,using=".//*[@id=\'navbar-collapse-1\']/ul/li[7]/a")
	WebElement blog_link;
	@FindBy(how=How.XPATH,using=".//*[@id=\'grad1\']/div/div[1]/h2")
	WebElement blog_h2;
	@FindBy(how=How.XPATH,using=".//*[@id=\'grad1\']/div/div[2]/div[1]/center/div[1]/div/img")
	WebElement blog_img1;
	@FindBy(how=How.XPATH,using=".//*[@id=\'grad1\']/div/div[2]/div[1]/center/div[2]/p/a/b")
	WebElement blog_img1_link;
	@FindBy(how=How.XPATH,using=".//*[@id=\'grad1\']/div/div[2]/div[2]/center/div[1]/div/img")
	WebElement blog_img2;
	@FindBy(how=How.XPATH,using=".//*[@id=\'grad1\']/div/div[2]/div[2]/center/div[2]/p/a")
	WebElement blog_img2_link;
	@FindBy(how=How.XPATH,using=".//*[@id=\'grad1\']/div/div[2]/div[3]/center/div[1]/div/img")
	WebElement blog_img3;
	@FindBy(how=How.XPATH,using=".//*[@id=\'grad1\']/div/div[2]/div[3]/center/div[2]/p/a")
	WebElement blog_img3_link;
	@FindBy(how=How.XPATH,using=".//*[@id=\'grad1\']/div/div[2]/div[4]/center/div[1]/div/img")
	WebElement blog_img4;
	@FindBy(how=How.XPATH,using=".//*[@id=\'grad1\']/div/div[2]/div[4]/center/div[2]/p/a")
	WebElement blog_img4_link;


	//contact

	@FindBy(how=How.XPATH,using=".//*[@id=\'navbar-collapse-1\']/ul/li[8]/a")
	WebElement contact_link;
	@FindBy(how=How.XPATH,using="./html//div[@id='contact-section']/div[@class='container']//ul//i[@class='fa fa-map-marker']")
	WebElement contact_address;
	@FindBy(how=How.XPATH,using=".//*[@id=\'contact-section\']/div/div[1]/div[1]/div/ul/li[1]")
	WebElement contact_address_text;
	@FindBy(how=How.XPATH,using=".//*[@id=\'contact-section\']/div/div[1]/div[1]/div/ul/li[2]/div")
	WebElement contact_phone;
	@FindBy(how=How.XPATH,using=".//*[@id=\'contact-section\']/div/div[1]/div[1]/div/ul/li[2]")
	WebElement contact_phone_text;
	@FindBy(how=How.XPATH,using=".//*[@id=\'contact-section\']/div/div[1]/div[1]/div/ul/li[3]/div")
	WebElement contact_email;
	@FindBy(how=How.XPATH,using=".//*[@id=\'contact-section\']/div/div[1]/div[1]/div/ul/li[3]")
	WebElement contact_email_text;
	@FindBy(how=How.XPATH,using=".//*[@id=\'contact-section\']/div/div[1]/div[1]/div/ul/li[4]/div")
	WebElement contact_website;
	@FindBy(how=How.XPATH,using=".//*[@id=\'contact-section\']/div/div[1]/div[1]/div/ul/li[4]")
	WebElement contact_website_text;
	@FindBy(how=How.XPATH,using=".//*[@id=\'contact-section\']/div/div[2]/form/div[1]/div[1]/div/input")
	WebElement contact_fname;
	@FindBy(how=How.XPATH,using=".//*[@id=\'contact-section\']/div/div[2]/form/div[1]/div[2]/div/input")
	WebElement contact_lname;
	@FindBy(how=How.XPATH,using=".//*[@id=\'contact-section\']/div/div[2]/form/div[1]/div[3]/div/input")
	WebElement contact_gmail;
	@FindBy(how=How.XPATH,using=".//*[@id=\'contact-section\']/div/div[2]/form/div[2]/input")
	WebElement contact_subject;
	@FindBy(how=How.XPATH,using=".//*[@id=\'contact-section\']/div/div[2]/form/textarea")
	WebElement contact_message;
	@FindBy(how=How.XPATH,using=".//*[@id=\'contact-section\']/div/div[2]/form/button")
	WebElement contact_submit;
	XSSFWorkbook workbook;
	XSSFSheet sheet;


	//footer page

	@FindBy(how=How.XPATH,using="./html/body/footer/div/a/img")
	WebElement logo_img;
	@FindBy(how=How.XPATH,using="./html/body/footer/div/ul/li[1]/a")
	WebElement fb_link;
	@FindBy(how=How.XPATH,using="./html/body/footer/div/ul/li[2]/a/i")
	WebElement twitter_link;
	@FindBy(how=How.XPATH,using="./html/body/footer/div/ul/li[3]/a")
	WebElement linkedin_link;
	@FindBy(how=How.XPATH,using="/html/body/footer/div/p")
	WebElement footer_h2;
	@FindBy(how=How.XPATH,using="/html/body/button")
	WebElement arrow_up;


	public performermethod(WebDriver driver) {           
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	public void headerlogo() throws InterruptedException {
		test=extend.createTest("Header logo");
		header_logo.click();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

	public void homepage () throws InterruptedException {
		test = extend.createTest("HomePage");
		String home_text = driver.findElement(By.xpath("//*[@id=\'main-banner-slider\']/ul/li[1]/div[2]/div/div/div/h1")).getText();
		System.out.println(home_text);
		Assert.assertEquals("WHY TO CHOOSE STARSPERFORMER?", home_text);
		System.out.println("Test passed");
		String parent_window = driver.getWindowHandle();
		home_box.click();
		Set<String> child_window = driver.getWindowHandles();
		for(String new_window : child_window)
		{
			try {
				driver.switchTo().window(new_window);

			}
			catch(NoSuchWindowException e) {
				throw e;
			}

		}


		Thread.sleep(1000);
		driver.navigate().back();
		driver.switchTo().window(parent_window);


	}

	public void aboutpage() throws InterruptedException {
		test = extend.createTest("About page");
		about_link.click();
		String aboutheading=about_h2.getText();
		Assert.assertEquals("ABOUT STARSPERFORMER", aboutheading);
		System.out.println("About heading correct");
		String aboutpara = about_p.getText();
		Assert.assertEquals("Starsperformer is the best SDET Training Institute in Coimbatore with 100% Job assured placement support. Starsperformer has provided SDET courses by real time software IoT projects with certified experts. We provide Software Testing, Placement Training, JAVA, .NET, PHP, Python, Android, iOS and more advanced training courses.", aboutpara);
		System.out.println("About paragraph was correct");

		//agile

		Actions act_agile =new Actions(driver);
		act_agile.moveToElement(about_agile).perform();
		Thread.sleep(1000);
		String agile_text = about_agile_p.getText();
		System.out.println(agile_text);
		Assert.assertEquals("It is the practice of operations and development engineers participating together in the entire service lifecycle.", agile_text);
		System.out.println("Agile para correct");

		//Artificial

		Actions act_artificial = new Actions(driver);
		act_artificial.moveToElement(about_artificial).perform();
		Thread.sleep(1000);
		String artificial_text=about_artificial_p.getText();
		Assert.assertEquals("AI (Artificial Intelligence) is the simulation of human intelligence processes by machines.", artificial_text);
		System.out.println("Artificial para was correct");

		//Softskills

		Actions act_soft =new Actions(driver);
		act_soft.moveToElement(about_soft).perform();
		Thread.sleep(1000);
		String soft_text =about_soft_p.getText();
		Assert.assertEquals("Soft skills are character traits and interpersonal skills that characterize a person's relationships with other people.",soft_text);
		System.out.println("SoftSkills para was corrected");

		//Leadership

		Actions act_leadership = new Actions(driver);
		act_leadership.moveToElement(about_leader).perform();
		Thread.sleep(1000);
		String leader_text = about_leader_p.getText();
		Assert.assertEquals("An essential component in making thoughtful decisions about their organization's mission and goals.", leader_text);
		System.out.println("Leadership para was corrected");

	}

	public void servicepage() throws InterruptedException {

		test = extend.createTest("Service page");
		service_link.click();


		String service_h2_text =service_h2.getText();
		Assert.assertEquals("SERVICES WE PROVIDE", service_h2_text);
		System.out.println("Service header was corrected");

		String service_p_text=service_p.getText();
		System.out.println(service_p_text);
		Assert.assertEquals("\"We provide fantastic Services in order to keep going\"", service_p_text);
		System.out.println("Service sub-header was corrected");

		Actions ipcoe_box=new Actions(driver);
		ipcoe_box.moveToElement(service_ipcoe).perform();
		Thread.sleep(1000);
		String service_ipcoe_text=service_ipcoe_p.getText();
		System.out.println(service_ipcoe_text);

		Actions interactive_box=new Actions(driver);
		interactive_box.moveToElement(service_interactive).perform();
		Thread.sleep(1000);
		String service_inter_text=service_interactive_p.getText();
		System.out.println(service_inter_text);

		Actions technical_box=new Actions(driver);
		technical_box.moveToElement(service_technical).perform();
		Thread.sleep(1000);
		String service_tech_text =service_technical_p.getText();
		System.out.println(service_tech_text);

	}

	public void programpage() throws Exception {


		test =extend.createTest("Program page");
		subprogram program_work = new subprogram(driver);
		program_work.subfunction(); 
	}
	
	
	public void clientpage() {
		test= extend.createTest("Client page");
		client_link.click();
		test.log(Status.PASS,  "client link is clicked");
		String client_text=client_h2.getText();
		System.out.println(client_text);
		Assert.assertEquals("OUR HAPPY CLIENTS", client_text);
		System.out.println("The header section was correct");
		String client_sub_text=client_h4.getText();
		System.out.println(client_sub_text);
		Assert.assertEquals("Nehru Group Of Institutions", client_sub_text);
		System.out.println("The Sub-header was correct");
		Point imag_class=client_img.getLocation();
		int xcordi = imag_class.getX();
		System.out.println("The image position in left side  " +xcordi);
		int ycordi =imag_class.getY();
		System.out.println("The image postion in top " +ycordi);
		int img_width =client_img.getSize().getWidth();
		int img_height = client_img.getSize().getHeight();
		System.out.println("The image width " +img_width +" and Height is " + img_height);
		String client_h3_text =client_h3.getText();
		System.out.println(client_h3_text);
		//	Assert.assertEquals("Our Industrialization Of Project Center Of Excellence (IPCoE)" + 
		//			"\r\n" + 
		//			"Generates Linear Revenue & Sustainable Job Opportunities" 
		//			, client_h3_text);
		//	System.out.println("correct");

	}
	public void pro_durationpage() throws InterruptedException {
		test =extend.createTest("Program Duration");
		pro_duration_link.click();
		Actions pro_trannie = new Actions(driver);
		pro_trannie.moveToElement(pro_trannie_sdet).perform();
		Thread.sleep(2000);
		String trannie_bgclr=pro_trannie_clr.getCssValue("background-color");
		String trannie_color=pro_trannie_clr.getCssValue("color");
		System.out.println("The Bg color RGBA value" +"  "+trannie_bgclr + "Text color RGBA value"+ " "+ trannie_color);
		Assert.assertEquals("rgba(55, 80, 153, 1)",trannie_bgclr);
		System.out.println("The rgba color was equal");
		String trannie_qua_text=pro_trannie_qua.getText();
		System.out.println(trannie_qua_text);
		Assert.assertEquals("Qualification", trannie_qua_text);
		String trannie_qua_bgclr=pro_trannie_qua.getCssValue("background-color");
		System.out.println(trannie_qua_bgclr);
		String trannie_pre_text=pro_trannie_pre.getText();
		Assert.assertEquals("Pre Final Year & Final Year", trannie_pre_text);
		String trannie_pre_bgclr=pro_trannie_pre.getCssValue("background-color");
		System.out.println(trannie_pre_bgclr);
		String trannie_dura_text=pro_trannie_duration.getText();
		System.out.println(trannie_dura_text);
		Assert.assertEquals("Duration", trannie_dura_text);
		String trannie_month_text=pro_trannie_month.getText();
		System.out.println(trannie_month_text);
		Assert.assertEquals("6 months with Integrated Projects", trannie_month_text);

		Actions pro_junior = new Actions(driver);
		pro_junior.moveToElement(pro_junior_sdet).perform();
		Thread.sleep(2000);
		String junior_bgclr=pro_junior_clr.getCssValue("background-color");
		String junior_color=pro_junior_clr.getCssValue("color");
		System.out.println("The Bg color RGBA value" +"  "+junior_bgclr + "Text color RGBA value"+ " "+ junior_color);
		Assert.assertEquals("rgba(23, 150, 128, 1)",junior_bgclr);
		System.out.println("The rgba color was equal");	
	}

	public void blogpage() throws InterruptedException {
		test=extend.createTest("Blog page");
		blog_link.click();
		String blog_h2_text=blog_h2.getText();
		System.out.println(blog_h2_text);
		Assert.assertEquals("OUR LATEST BLOGS", blog_h2_text);

		Boolean ImagePresent1 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", blog_img1);
		if (!ImagePresent1)
		{
			System.out.println("Image not displayed.");
		}
		else
		{
			System.out.println("Blog first image displayed.");
		}

		Actions act_img1=new Actions(driver);
		act_img1.moveToElement(blog_img1).perform();
		Thread.sleep(2000);
		String parent1_window=driver.getWindowHandle();
		blog_img1_link.click();
		//	JavascriptExecutor js=(JavascriptExecutor)driver;
		//	js.executeScript("window.scrollBy(0,1200)");
		Set<String> child1_window=driver.getWindowHandles();

		for(String new1_window:child1_window) {
			try {

				driver.switchTo().window(new1_window);

			}
			catch(NoSuchWindowException e) {
				throw e;
			}
		} 

		Thread.sleep(5000);
		driver.navigate().back();
		driver.switchTo().window(parent1_window);

		Boolean ImagePresent2= (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", blog_img2);
		if (!ImagePresent2)
		{
			System.out.println("Image not displayed.");
		}
		else
		{
			System.out.println("Blog second Image displayed.");
		}


		Actions act_img2=new Actions(driver);
		act_img2.moveToElement(blog_img2).perform();
		Thread.sleep(2000);
		String parent2_window=driver.getWindowHandle();
		blog_img2_link.click();
		Set<String> child2_window=driver.getWindowHandles();

		for(String new2_window:child2_window) {
			try {

				driver.switchTo().window(new2_window);

			}
			catch(NoSuchWindowException e) {
				throw e;
			}
		} 

		Thread.sleep(5000);
		driver.navigate().back();
		driver.switchTo().window(parent2_window);

		Boolean ImagePresent3= (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", blog_img3);
		if (!ImagePresent3)
		{
			System.out.println("Image not displayed.");
		}
		else
		{
			System.out.println("Blog Third Image displayed.");
		}


		Actions act_img3=new Actions(driver);
		act_img3.moveToElement(blog_img3).perform();
		Thread.sleep(2000);
		String parent3_window=driver.getWindowHandle();
		blog_img3_link.click();
		Set<String> child3_window=driver.getWindowHandles();

		for(String new3_window:child3_window) {
			try {

				driver.switchTo().window(new3_window);

			}
			catch(NoSuchWindowException e) {
				throw e;
			}
		} 

		Thread.sleep(5000);
		driver.navigate().back();
		driver.switchTo().window(parent3_window);
		Boolean ImagePresent4= (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", blog_img4);
		if (!ImagePresent4)
		{
			System.out.println("Image not displayed.");
		}
		else
		{
			System.out.println("Blog Fourth Image displayed.");
		}


		Actions act_img4=new Actions(driver);
		act_img4.moveToElement(blog_img3).perform();
		Thread.sleep(2000);
		String parent4_window=driver.getWindowHandle();
		blog_img4_link.click();
		Set<String> child4_window=driver.getWindowHandles();

		for(String new4_window:child4_window) {
			try {

				driver.switchTo().window(new4_window);

			}
			catch(NoSuchWindowException e) {
				throw e;
			}
		} 

		Thread.sleep(5000);
		driver.navigate().back();
		driver.switchTo().window(parent4_window);

	}


	public void contactpage() throws InterruptedException, IOException {
		test=extend.createTest("Contact Page");
		contact_link.click();
		Actions act_address=new Actions(driver);
		act_address.moveToElement(contact_address).perform();
		String address_text=contact_address_text.getText();
		System.out.println(address_text);
		Actions act_phone = new Actions(driver);
		act_phone.moveToElement(contact_phone).perform();
		Thread.sleep(5000);
		String phone_text=contact_phone_text.getText();
		System.out.println(phone_text);
		Actions act_email=new Actions(driver);
		act_email.moveToElement(contact_email).perform();
		Thread.sleep(5000);
		String email_text=contact_email_text.getText();
		System.out.println(email_text);
		Actions act_website=new Actions(driver);
		act_website.moveToElement(contact_website).perform();
		String website_text=contact_website_text.getText();
		System.out.println(website_text);
		workbook=new XSSFWorkbook("C:\\Users\\admin\\Desktop\\starsperformer.xlsx");
		sheet = workbook.getSheet("sheet1");
		Thread.sleep(2000);
		String fname_data = sheet.getRow(1).getCell(0).getStringCellValue();
		contact_fname.sendKeys(fname_data);
		Thread.sleep(2000);
		System.out.println("First name "+ " " + fname_data);
		String lname_data=sheet.getRow(1).getCell(1).getStringCellValue();
		contact_lname.sendKeys(lname_data);
		Thread.sleep(2000);
		System.out.println("Last name "+ " " + lname_data);
		String gmail_data=sheet.getRow(1).getCell(2).getStringCellValue();
		contact_gmail.sendKeys(gmail_data);
		Thread.sleep(2000);
		System.out.println("Gmail "+ " " + gmail_data);
		String subject_data=sheet.getRow(1).getCell(3).getStringCellValue();
		contact_subject.sendKeys(subject_data);
		Thread.sleep(2000);
		System.out.println("Subject "+ " " + subject_data);
		String message_data=sheet.getRow(1).getCell(4).getStringCellValue();
		contact_message.sendKeys(message_data);
		Thread.sleep(2000);
		System.out.println("Message "+ " " + message_data);
		contact_submit.click();
		Thread.sleep(1000);

	}
	public void footer() throws InterruptedException {
		test=extend.createTest("Logo");
		logo_img.click();
		Thread.sleep(2000);
		String logo_current =driver.getCurrentUrl();
		System.out.println(logo_current);
		try {
			assertTrue(driver.getCurrentUrl().contains("http://starsperformer.com/index.php"));
			System.out.println("The webpage was correctly open");
		}catch(Throwable e) {
			System.out.println("Not matching ");

		}
		String current_window=driver.getWindowHandle();
		fb_link.click();
		Set<String> sub_window = driver.getWindowHandles();
		for(String blesing_window: sub_window) {
			try {
				driver.switchTo().window(blesing_window);
			}
			catch(NoSuchWindowException e) {
				throw e;
			}
		}
		Thread.sleep(2000);
		driver.navigate().back();
		driver.switchTo().window(current_window);		
		System.out.println("The FB page was sucessfully open and closed");
		Thread.sleep(2000);
		String current1_window=driver.getWindowHandle();
		twitter_link.click();
		Set<String> sub1_window=driver.getWindowHandles();
		for(String blessing1_window:sub1_window) {
			try {
				driver.switchTo().window(blessing1_window);

			}
			catch(NoSuchWindowException e) {
				throw e;
			}

		}

		Thread.sleep(2000);
		driver.navigate().back();
		driver.switchTo().window(current1_window);
		System.out.println("The twitter page was sucessfully open and closed");
		Thread.sleep(2000);
		String current2_window=driver.getWindowHandle();
		twitter_link.click();
		Set<String> sub2_window=driver.getWindowHandles();
		for(String blessing2_window:sub2_window) {
			try {
				driver.switchTo().window(blessing2_window);

			}
			catch(NoSuchWindowException e) {
				throw e;
			}

		}

		Thread.sleep(2000);
		driver.navigate().back();
		driver.switchTo().window(current2_window);
		System.out.println("The linkedin page was sucessfully open and closed");
		Thread.sleep(2000);
		String footer_text=footer_h2.getText();
		System.out.println(footer_text);
		Assert.assertEquals("© Copyrights 2019 by INFOTEST IT Services PVT LTD",footer_text);
		System.out.println("The footer text was correct");
		Thread.sleep(2000);
		arrow_up.click();
		Thread.sleep(2000);
		System.out.println("The Starsperformer Website for excuted in successfully");

	}



}












