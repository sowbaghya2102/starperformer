package pageobject;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class subprogram {
	private WebDriver driver=null;
	@FindBy(how=How.XPATH,using=".//*[@id=\'navbar-collapse-1\']/ul/li[4]/a")
	WebElement program_link;
	@FindBy(how=How.XPATH,using=".//*[@id=\'project-section\']/div/div[1]/h2")
	WebElement program_h2;
	@FindBy(how=How.XPATH,using="//*[@id=\'project-section\']/div/div[2]/ul/li[1]")
	WebElement program_all;
	@FindBy(how=How.NAME,using="java")
	WebElement pro1_java1_box;
	@FindBy(how=How.XPATH,using="./html/body/div[5]/h2")
	WebElement pro1_java1_h2;
	@FindBy(how=How.XPATH,using="./html/body/div[5]/p")
	WebElement pro1_java1_p;
	@FindBy(how=How.XPATH,using="/html/body/div[5]/div[7]/div/button")
	WebElement pro1_java1_confirm;
	@FindBy(how=How.NAME,using="javareg")
	WebElement pro1_java1_register;
	@FindBy(how=How.XPATH,using=".//*[@id=\'MixItUp3E08C6\']/div[1]/div/div/div/div/div/h4")
    WebElement java_h4;
	//*[@id="MixItUpF99ADA"]/div[1]/div/div/div/div/div/h4
	//*[@id="MixItUp3E08C6"]/div[2]/div/div/div/div/div/h4
	@FindBy(how=How.NAME,using="net")
	WebElement pro1_net1_box;
	@FindBy(how=How.NAME,using="netreg")
	WebElement pro1_net1_register;
	@FindBy(how=How.XPATH,using=".//*[@id=\'MixItUp3E08C6\']/div[2]/div/div/div/div/div/h4")
    WebElement net_h4;
	
	
	@FindBy(how=How.NAME,using="android")
	WebElement pro1_android1_box;
	@FindBy(how=How.NAME,using="androidreg")
	WebElement pro1_android1_register;
	@FindBy(how=How.XPATH,using=".//*[@id=\'MixItUp3E08C6\']/div[3]/div/div/div/div/div/h4")
    WebElement android_h4;
	
	@FindBy(how=How.NAME,using="website")
	WebElement pro1_website_box;
	@FindBy(how=How.NAME,using="websitereg")
	WebElement pro1_website_reg;
	@FindBy(how=How.XPATH,using=".//*[@id=\'MixItUp3E08C6\']/div[4]/div/div/div/div/div/h4")
	WebElement website_h4;

	@FindBy(how=How.NAME,using="python")
	WebElement pro1_python_box;
	@FindBy(how=How.NAME,using="pythonreg")
	WebElement pro1_python_reg;
	@FindBy(how=How.XPATH,using="//*[@id=\'MixItUp3E08C6\']/div[5]/div/div/div/div/div/h4")
    WebElement python_h4;
	
	@FindBy(how=How.NAME,using="auto")
	WebElement pro1_auto_box;
	@FindBy(how=How.NAME,using="autoreg")
	WebElement pro1_auto_reg;
	@FindBy(how=How.XPATH,using="//*[@id=\'MixItUp3E08C6\']/div[6]/div/div/div/div/div/h4")
    WebElement auto_h4;
	
	@FindBy(how=How.NAME,using="perform")
	WebElement pro1_perform_box;
	@FindBy(how=How.NAME,using="performreg")
	WebElement pro1_perform_reg;
	@FindBy(how=How.XPATH,using="//*[@id=\'MixItUp3E08C6\']/div[7]/div/div/div/div/div/h4")
    WebElement perform_h4;
	
	@FindBy(how=How.NAME,using="cloud")
	WebElement pro1_cloud_box;
	@FindBy(how=How.NAME,using="cloudreg")
	WebElement pro1_cloud_reg;
	@FindBy(how=How.XPATH,using="//*[@id=\'MixItUp3E08C6\']/div[8]/div/div/div/div/div/h4")
	WebElement cloud_h4;
	
	@FindBy(how=How.XPATH,using=".//*[@id=\'project-section\']/div/div[2]/ul/li[2]")
	WebElement app_link;
	@FindBy(how=How.XPATH,using=".//*[@id=\'project-section\']/div/div[2]/ul/li[3]")
	WebElement testing_link;
	@FindBy(how=How.XPATH,using=".//*[@id=\'project-section\']/div/div[2]/ul/li[4]")
	WebElement cloud_link;
	@FindBy(how=How.XPATH,using=".//*[@id=\'project-section\']/div/div[2]/ul/li[5]")
	WebElement website_link;
	@FindBy(how=How.XPATH,using=".//*[@id=\'project-section\']/div/div[2]/ul/li[6]")
	WebElement db_lnik;
	@FindBy(how=How.XPATH,using=".//*[@id=\'project-section\']/div/div[2]/ul/li[7]")
	WebElement mobile_link;
	
	XSSFWorkbook workbook1;
	XSSFSheet sheet1;
	@FindBy(how=How.XPATH,using=".//*[@id=\'modform\']/center/div/div[1]/div[2]/div/div/input")
	WebElement pro1_java1_reg1_name;
	@FindBy(how=How.XPATH,using=".//*[@id=\'modform\']/center/div/div[2]/div[2]/div/div/input")
	WebElement pro1_java1_reg1_email;
	@FindBy(how=How.XPATH,using=".//*[@id=\'modform\']/center/div/div[3]/div[2]/div/div/input")
	WebElement pro1_java1_reg1_phone;
	@FindBy(how=How.XPATH,using=".//*[@id=\'modform\']/center/div/div[4]/div[2]/select")
	WebElement pro1_java1_reg1_communication;
	@FindBy(how=How.XPATH,using=".//*[@id=\'modform\']/center/div/div[5]/div[2]/div/div/input")
	WebElement pro1_java1_reg1_qualification;
	@FindBy(how=How.XPATH,using=".//*[@id=\'modform\']/center/div/div[6]/div[2]/div/div/input")
	WebElement pro1_java1_reg1_clg;
	@FindBy(how=How.XPATH,using=".//*[@id=\'modform\']/div[2]/button[1]")
	WebElement pro1_java1_reg1_submit;
	
	//public String java_h4_text;
	
	public subprogram(WebDriver driver) {           
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	public void getdatafromexcel(int i) throws IOException, InterruptedException
	{
		workbook1=new XSSFWorkbook("C:\\Users\\admin\\Desktop\\starsperformer.xlsx");
		sheet1 = workbook1.getSheet("sheet2");
		//for(int i=1;i<=sheet1.getLastRowNum();i++)
				{
			String name_data = sheet1.getRow(i).getCell(0).getStringCellValue();
			String pro1_email_data=sheet1.getRow(i).getCell(1).getStringCellValue();
			String pro1_phone_data=sheet1.getRow(i).getCell(2).getStringCellValue();
			String pro1_qualification_data =sheet1.getRow(i).getCell(3).getStringCellValue();
			String pro1_college_data=sheet1.getRow(i).getCell(4).getStringCellValue();

			if(i==1)
			{
				register_java(name_data, pro1_email_data,pro1_phone_data, pro1_qualification_data,pro1_college_data);
			}
			else if(i==2) {
				register_net(name_data, pro1_email_data,pro1_phone_data, pro1_qualification_data,pro1_college_data);

			}
			else if(i==3) {
				register_android(name_data, pro1_email_data,pro1_phone_data, pro1_qualification_data,pro1_college_data);
			}
			else if(i==4) {
				register_website(name_data, pro1_email_data, pro1_phone_data, pro1_qualification_data, pro1_college_data);
			}
			
			else if(i==5) {
				register_python(name_data, pro1_email_data, pro1_phone_data, pro1_qualification_data, pro1_college_data);
			}
			else if(i==6) {
				register_auto(name_data, pro1_email_data, pro1_phone_data, pro1_qualification_data, pro1_college_data);
			}
			else if(i==7) {
				register_perform(name_data, pro1_email_data, pro1_phone_data, pro1_qualification_data, pro1_college_data);
			}
			else if(i==8) {
				register_cloud(name_data, pro1_email_data, pro1_phone_data, pro1_qualification_data, pro1_college_data);
			}
		}
	}
	
	
	public void register_java(String name_data, String pro1_email_data, String pro1_phone_data, String pro1_qualification_data,String pro1_college_data) throws IOException, InterruptedException 
	{
		
		pro1_java1_reg1_name.sendKeys(name_data);
		Thread.sleep(2000);
		System.out.println("name "+ " " + name_data);
		pro1_java1_reg1_email.sendKeys(pro1_email_data);
		Thread.sleep(2000);
		System.out.println("Email "+ " " + pro1_email_data);
		pro1_java1_reg1_phone.sendKeys(pro1_phone_data);
		Thread.sleep(2000);
		pro1_java1_reg1_communication.click();
		Select drop_communication =new Select(pro1_java1_reg1_communication);
		drop_communication.selectByIndex(3);
		pro1_java1_reg1_qualification.sendKeys(pro1_qualification_data);
		Thread.sleep(2000);
		System.out.println("Qualification"+ " " + pro1_qualification_data);
		pro1_java1_reg1_clg.sendKeys(pro1_college_data);
		Thread.sleep(2000);
		pro1_java1_reg1_submit.click();
		Thread.sleep(2000);

		Alert pro1_alert = driver.switchTo().alert();
		pro1_alert.accept();
	}
	public void register_net(String name_data, String pro1_email_data, String pro1_phone_data, String pro1_qualification_data,String pro1_college_data) throws IOException, InterruptedException {
	
		
		pro1_java1_reg1_name.sendKeys(name_data);
		Thread.sleep(2000);
		System.out.println("name "+ " " + name_data);
		pro1_java1_reg1_email.sendKeys(pro1_email_data);
		Thread.sleep(2000);
		System.out.println("Email "+ " " + pro1_email_data);
		pro1_java1_reg1_phone.sendKeys(pro1_phone_data);
		Thread.sleep(2000);
		pro1_java1_reg1_communication.click();
		
		Select drop_communication =new Select(pro1_java1_reg1_communication);
		drop_communication.selectByIndex(2);
		pro1_java1_reg1_qualification.sendKeys(pro1_qualification_data);
		Thread.sleep(2000);
		System.out.println("Qualification"+ " " + pro1_qualification_data);
		pro1_java1_reg1_clg.sendKeys(pro1_college_data);
		Thread.sleep(2000);
		pro1_java1_reg1_submit.click();
		Thread.sleep(2000);
		Alert pro1_alert = driver.switchTo().alert();
		pro1_alert.accept();
	}
	public void register_android(String name_data, String pro1_email_data, String pro1_phone_data, String pro1_qualification_data,String pro1_college_data) throws IOException, InterruptedException {
		
		name_data = sheet1.getRow(3).getCell(0).getStringCellValue();
		pro1_java1_reg1_name.sendKeys(name_data);
		Thread.sleep(2000);
		System.out.println("name "+ " " + name_data);
		pro1_java1_reg1_email.sendKeys(pro1_email_data);
		Thread.sleep(2000);
		System.out.println("Email "+ " " + pro1_email_data);
		pro1_java1_reg1_phone.sendKeys(pro1_phone_data);
		Thread.sleep(2000);
		pro1_java1_reg1_communication.click();
		
		Select drop_communication =new Select(pro1_java1_reg1_communication);
		drop_communication.selectByIndex(1);
		pro1_java1_reg1_qualification.sendKeys(pro1_qualification_data);
		Thread.sleep(2000);
		System.out.println("Qualification"+ " " + pro1_qualification_data);
		pro1_java1_reg1_clg.sendKeys(pro1_college_data);
		Thread.sleep(2000);
		pro1_java1_reg1_submit.click();
		Thread.sleep(2000);

		Alert pro1_alert = driver.switchTo().alert();
		pro1_alert.accept();
	}
	public void register_website(String name_data, String pro1_email_data, String pro1_phone_data, String pro1_qualification_data,String pro1_college_data) throws IOException, InterruptedException {
		workbook1=new XSSFWorkbook("C:\\Users\\admin\\Desktop\\starsperformer.xlsx");
		sheet1 = workbook1.getSheet("sheet2");
		Thread.sleep(2000);
		pro1_java1_reg1_name.sendKeys(name_data);
		Thread.sleep(2000);
		System.out.println("name "+ " " + name_data);
		pro1_java1_reg1_email.sendKeys(pro1_email_data);
		Thread.sleep(2000);
		System.out.println("Email "+ " " + pro1_email_data);
		pro1_java1_reg1_phone.sendKeys(pro1_phone_data);
		Thread.sleep(2000);
		pro1_java1_reg1_communication.click();
		
		Select drop_communication =new Select(pro1_java1_reg1_communication);
		drop_communication.selectByIndex(1);
		pro1_java1_reg1_qualification.sendKeys(pro1_qualification_data);
		Thread.sleep(2000);
		System.out.println("Qualification"+ " " + pro1_qualification_data);
		pro1_java1_reg1_clg.sendKeys(pro1_college_data);
		Thread.sleep(2000);
		pro1_java1_reg1_submit.click();
		Thread.sleep(2000);

		Alert pro1_alert = driver.switchTo().alert();
		pro1_alert.accept();
	}
	public void register_python(String name_data, String pro1_email_data, String pro1_phone_data, String pro1_qualification_data,String pro1_college_data) throws IOException, InterruptedException {
		
		pro1_java1_reg1_name.sendKeys(name_data);
		Thread.sleep(2000);
		System.out.println("name "+ " " + name_data);
		pro1_java1_reg1_email.sendKeys(pro1_email_data);
		Thread.sleep(2000);
		System.out.println("Email "+ " " + pro1_email_data);
		pro1_java1_reg1_phone.sendKeys(pro1_phone_data);
		Thread.sleep(2000);
		pro1_java1_reg1_communication.click();
		
		Select drop_communication =new Select(pro1_java1_reg1_communication);
		drop_communication.selectByIndex(1);
		pro1_java1_reg1_qualification.sendKeys(pro1_qualification_data);
		Thread.sleep(2000);
		System.out.println("Qualification"+ " " + pro1_qualification_data);
		pro1_java1_reg1_clg.sendKeys(pro1_college_data);
		Thread.sleep(2000);
		pro1_java1_reg1_submit.click();
		Thread.sleep(2000);

		Alert pro1_alert = driver.switchTo().alert();
		pro1_alert.accept();
	}
	public void register_auto(String name_data, String pro1_email_data, String pro1_phone_data, String pro1_qualification_data,String pro1_college_data) throws IOException, InterruptedException {
		pro1_java1_reg1_name.sendKeys(name_data);
		Thread.sleep(2000);
		System.out.println("name "+ " " + name_data);
		pro1_java1_reg1_email.sendKeys(pro1_email_data);
		Thread.sleep(2000);
		System.out.println("Email "+ " " + pro1_email_data);
		pro1_java1_reg1_phone.sendKeys(pro1_phone_data);
		Thread.sleep(2000);
		pro1_java1_reg1_communication.click();
		
		Select drop_communication =new Select(pro1_java1_reg1_communication);
		drop_communication.selectByIndex(1);
		pro1_java1_reg1_qualification.sendKeys(pro1_qualification_data);
		Thread.sleep(2000);
		System.out.println("Qualification"+ " " + pro1_qualification_data);
		pro1_java1_reg1_clg.sendKeys(pro1_college_data);
		Thread.sleep(2000);
		pro1_java1_reg1_submit.click();
		Thread.sleep(2000);

		Alert pro1_alert = driver.switchTo().alert();
		pro1_alert.accept();
	}
	public void register_perform(String name_data, String pro1_email_data, String pro1_phone_data, String pro1_qualification_data,String pro1_college_data) throws IOException, InterruptedException {
		
		pro1_java1_reg1_name.sendKeys(name_data);
		Thread.sleep(2000);
		System.out.println("name "+ " " + name_data);
		pro1_java1_reg1_email.sendKeys(pro1_email_data);
		Thread.sleep(2000);
		System.out.println("Email "+ " " + pro1_email_data);
		pro1_java1_reg1_phone.sendKeys(pro1_phone_data);
		Thread.sleep(2000);
		pro1_java1_reg1_communication.click();
		Select drop_communication =new Select(pro1_java1_reg1_communication);
		drop_communication.selectByIndex(1);
		pro1_java1_reg1_qualification.sendKeys(pro1_qualification_data);
		Thread.sleep(2000);
		System.out.println("Qualification"+ " " + pro1_qualification_data);
		pro1_java1_reg1_clg.sendKeys(pro1_college_data);
		Thread.sleep(2000);
		pro1_java1_reg1_submit.click();
		Thread.sleep(2000);

		Alert pro1_alert = driver.switchTo().alert();
		pro1_alert.accept();
	}
	public void register_cloud(String name_data, String pro1_email_data, String pro1_phone_data, String pro1_qualification_data,String pro1_college_data) throws IOException, InterruptedException {
		
		pro1_java1_reg1_name.sendKeys(name_data);
		Thread.sleep(2000);
		System.out.println("name "+ " " + name_data);
		pro1_java1_reg1_email.sendKeys(pro1_email_data);
		Thread.sleep(2000);
		System.out.println("Email "+ " " + pro1_email_data);
		pro1_java1_reg1_phone.sendKeys(pro1_phone_data);
		Thread.sleep(2000);
		pro1_java1_reg1_communication.click();
		
		Select drop_communication =new Select(pro1_java1_reg1_communication);
		drop_communication.selectByIndex(2);
		pro1_java1_reg1_qualification.sendKeys(pro1_qualification_data);
		Thread.sleep(2000);
		System.out.println("Qualification"+ " " + pro1_qualification_data);
		pro1_java1_reg1_clg.sendKeys(pro1_college_data);
		Thread.sleep(2000);
		pro1_java1_reg1_submit.click();
		Thread.sleep(2000);

		Alert pro1_alert = driver.switchTo().alert();
		pro1_alert.accept();
	}


	public void subfunction() throws InterruptedException, IOException {
		//test =extend.createTest("Program page");
		program_link.click();
		String program_h2_text=program_h2.getText();
		System.out.println(program_h2_text);
		Assert.assertEquals("OUR IPCoE PROGRAMS", program_h2_text);
		System.out.println("Program header was correct");
		Thread.sleep(2000);
		program_all.click();
		Thread.sleep(2000);
		java();
		net();
		android();
		website();
		python();
		auto();
		perform();
		cloud();
		System.out.println("In program all functions are working in successfuly");
		app_link.click();
		Thread.sleep(2000);
		java();
		net();
		android();
		website();
		System.out.println("In program app development functions are working in successfuly");

		testing_link.click();
		Thread.sleep(2000);
		auto();
		perform();
		System.out.println("In program automation testing functions are working in successfuly");

		cloud_link.click();
		Thread.sleep(2000);
		cloud();
		System.out.println("In program cloud computing functions are working in successfuly");

		website_link.click();
		Thread.sleep(2000);
		website();
		System.out.println("In program webdesign&Website  functions are working in successfuly");

		db_lnik.click();
		Thread.sleep(2000);
		python();
		System.out.println("In program python functions are working in successfuly");

		mobile_link.click();
		Thread.sleep(2000);
		android();
		System.out.println("In program mobile functions are working in successfuly");



	}
	public void java() throws InterruptedException, IOException 
	{
		Actions act_java1 = new Actions(driver);
		act_java1.moveToElement(pro1_java1_box).build().perform();
		Thread.sleep(2000);
		pro1_java1_box.click();
		Thread.sleep(1000);

		boxcontent();

		Actions act_register = new Actions(driver);
		act_register.moveToElement(pro1_java1_box).build().perform();
		Thread.sleep(2000);
		pro1_java1_register.click();
		Thread.sleep(2000);
		getdatafromexcel(1);		 
}
	//all .net
	public void net() throws InterruptedException, IOException {
		Actions act_net1 = new Actions(driver);
		act_net1.moveToElement(pro1_net1_box).build().perform();
		Thread.sleep(2000);
				pro1_net1_box.click();
		Thread.sleep(1000);
		boxcontent();
		Actions net1_act = new Actions(driver);
		net1_act.moveToElement(pro1_net1_box).build().perform();
		pro1_net1_register.click();
		Thread.sleep(1000);
		getdatafromexcel(2);	
		}
	public void android() throws InterruptedException, IOException {
		//all android
		androidbaction();
		Thread.sleep(1000);
				pro1_android1_box.click();
		Thread.sleep(1000);
		boxcontent();
		androidbaction();
		pro1_android1_register.click();
		Thread.sleep(1000);
		getdatafromexcel(3);	
	}
	//all website
	public void website() throws InterruptedException, IOException {


		websiteaction();
		Thread.sleep(1000);
				pro1_website_box.click();
		Thread.sleep(1000);
		boxcontent();
		websiteaction();
		pro1_website_reg.click();
		Thread.sleep(1000);
		getdatafromexcel(4);	
	}

	//all python
	public void python() throws InterruptedException, IOException {
		pythonaction();
		Thread.sleep(1000);
				pro1_python_box.click();
		Thread.sleep(1000);
		boxcontent();
		pythonaction();
		pro1_python_reg.click();
		Thread.sleep(1000);
		getdatafromexcel(5);	
	}
	//all auto
	public void auto() throws InterruptedException, IOException {

		autoaction();
		Thread.sleep(1000);
		pro1_auto_box.click();
		Thread.sleep(1000);
		boxcontent();
		autoaction();
		Thread.sleep(1000);
		pro1_auto_reg.click();
		Thread.sleep(1000);
		getdatafromexcel(6);	

	}
	//all perform
	public void perform() throws InterruptedException, IOException {
		performaction();
		Thread.sleep(1000);
		pro1_perform_box.click();
		Thread.sleep(1000);
		boxcontent();
		performaction();
		pro1_perform_reg.click();
		Thread.sleep(1000);
		getdatafromexcel(7);	
	}
	//all cloud  cloudreg
	public void cloud() throws InterruptedException, IOException {
		cloudaction();
		Thread.sleep(1000);
		pro1_cloud_box.click();
		Thread.sleep(2000);
		boxcontent();
		cloudaction();
		pro1_cloud_reg.click();
		Thread.sleep(1000);
		getdatafromexcel(8);	

	}


	public void androidbaction() {
		Actions act_android =new Actions(driver);
		act_android.moveToElement(pro1_android1_box).build().perform();
	}
	public void websiteaction() {
		Actions act_website=new Actions(driver);
		act_website.moveToElement(pro1_website_box).build().perform();

	}
	public void pythonaction() {
		Actions act_python = new Actions(driver);
		act_python.moveToElement(pro1_python_box).build().perform();

	}
	public void autoaction() {
		Actions act_auto = new Actions(driver);
		act_auto.moveToElement(pro1_auto_box);
	}
	public void performaction() {
		Actions act_perform=new Actions(driver);
		act_perform.moveToElement(pro1_perform_box).build().perform();
	}
	public void cloudaction() {
		Actions act_cloud = new Actions(driver);
		act_cloud.moveToElement(pro1_cloud_box).build().perform();
	}
	public void boxcontent() throws InterruptedException {

		String pro1_java1_text=pro1_java1_h2.getText();
		System.out.println(pro1_java1_text);
		Thread.sleep(1000);

		String pro1_java1_text_p=pro1_java1_p.getText();
		System.out.println(pro1_java1_text_p);
		Thread.sleep(1000);
		pro1_java1_confirm.click();

	}


}


