package pageobject;

import java.io.IOException;

import org.testng.annotations.Test;

public class base extends main {


	@Test(priority=1)
	public void teast1() throws InterruptedException {
		performermethod headerlg=new performermethod(driver);
		headerlg.headerlogo();
	}

	@Test(priority=2)
	public void test2() throws InterruptedException
	{
		performermethod homepg= new performermethod(driver);
		homepg.homepage();
	}

	@Test(priority=3)
	public void test3() throws InterruptedException {
		performermethod aboutpg=new performermethod(driver);
		aboutpg.aboutpage();
	}
	@Test(priority=4)
	public void test4() throws InterruptedException {
		performermethod servicepg= new performermethod(driver);
		servicepg.servicepage();
	}
	@Test(priority=5)
	public void test5() throws Exception {
		performermethod programpg= new performermethod(driver);
		programpg.programpage();
	}

	@Test(priority=6)
	public void test6() {
		performermethod clientpg=new performermethod(driver);
		clientpg.clientpage();
	}
	@Test(priority=7)
	public void test7() throws InterruptedException {
		performermethod durationpg=new performermethod(driver);
		durationpg.pro_durationpage();
	}
	@Test(priority=8)
	public void test8() throws InterruptedException {
		performermethod blogpg=new performermethod(driver);
		blogpg.blogpage();
	}
	@Test(priority=9)
	public void test9() throws InterruptedException, IOException {
		performermethod contactpg=new performermethod(driver);
		contactpg.contactpage();
	}
	@Test(priority=10)
	public void test10() throws InterruptedException {
		performermethod logohp=new performermethod(driver);
		logohp.footer();
	}
}



