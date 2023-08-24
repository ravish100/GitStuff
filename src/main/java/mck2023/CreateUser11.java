package mck2023;

//import io.restassured.RestAssured;
//import io.restassured.path.json.JsonPath;
//import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
///import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import Files.db;
import Files.db2_advanced;

//import static io.restassured.RestAssured.given;

//import Files.AddAccounts;
////import Files.AddAccounts;
//import Files.CreateMCAP;
//import Files.CreateNGP;
//import Files.CreateUserBody2;
//import Files.EditPayload;
//import Files.PortalOkta;
//import Files.Template;
//import Files.db;
//import groovyjarjarantlr4.v4.runtime.atn.SemanticContext.OR;




public  class CreateUser11 {
	 static String  nm1 = "";
	
	public static  String AutoUser() throws IOException 
	{
		 
		nm1=FileWriteDemo.ReadwriteUser(nm1);
		return nm1;
	}
	
	public static void main(String[] args)
			throws IOException, ClassNotFoundException, SQLException, InterruptedException {

		// 1) create user in new portal+get+save user id
		// public static void NewportalUser(String NAME) {
		System.setProperty("webdriver.chrome.driver",
			//	"C:\\Users\\e3ph06j\\Downloads\\chromedriver_win32\\chromedriver.exe");
	"C:\\Users\\e3ph06j\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://testwcm.mckesson.com/portal/site/smo/template.LOGIN/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.findElement(By.id("idp-discovery-username")).sendKeys("auadmin1");
		driver.findElement(By.id("idp-discovery-username")).sendKeys("perfqa4");
		driver.findElement(By.id("idp-discovery-submit")).click();
		
		driver.findElement(By.id("okta-signin-password")).sendKeys("Hello@0987");
		// driver.findElement(By.id("btnLogin")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("okta-signin-submit")).click();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//a[@id='lnk10']")).click();
	//	driver.findElement(By.xpath("//a[@id='mmlink0']']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// System.out.println("reached here");
		driver.findElement(By.xpath("//a[contains(text(),'User Search')]")).click();
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		Thread.sleep(4000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();
		//driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/input[1]")).click();
		System.out.println(driver.getTitle());

		// Store the ID of the original window
		String originalWindow = driver.getWindowHandle();

		// Wait for the new window or tab
		// wait.until(numberOfWindowsToBe(2));

		// Loop through until we find a new window handle
		for (String windowHandle : driver.getWindowHandles()) {
			if (!originalWindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		// driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		System.out.println(driver.getTitle());
		//driver.get("https://b2b-portal-useradmin-ui-qa.dev.cs.west.us.mckesson.com/users/create");
		driver.get("https://b2b-portal-useradmin-ui-perf.dev.cs.west.us.mckesson.com/users/create");
		driver.navigate().refresh();
		
		//((JavascriptExecutor)driver).executeScript("localStorage.setItem(arguments[0],arguments[1])", "FEATURES_ENABLED","GROUPS,ACCOUNTS");
	//driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		 driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS) ;
		// driver.findElement(By.xpath("//a[contains(text(),'Proceed')]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/footer[1]/button[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/footer[1]/button[2]")).click();
		
		WebElement l = driver.findElement(By.id("rc_select_0"));
		//l.sendKeys("radv11");
		l.sendKeys("yani");
		l.sendKeys("sh");
		l.sendKeys("1");
	//	l.sendKeys("tdemo01");
	//	l.sendKeys("r");
		//l.sendKeys("de");
		 //driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
		//l.sendKeys("mo1");
		Thread.sleep(3000); 
	List<WebElement> dropdownItems = 	new WebDriverWait(driver, 10).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath(".//div[@class='ant-select-item ant-select-item-option']")));
	
	dropdownItems.stream().forEach(webElement->System.out.println(webElement.getText()));
	//dropdownItems.get(1).click();

		
		 for (WebElement element : dropdownItems) 
		 {
			 if(element.getText().contains("yanish1"))  
				 {
				 element.click();
				 break; }
				 }
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

//        	      driver.findElement(By.id("rc_select_0")).click();
//        	   //   driver.findElement(By.id("rc_select_0")).sendKeys(Keys.TAB);
//        	      // getAttribute() to get value as displayed in GUI
		String val = l.getAttribute("value");
		System.out.println("The input value: " + val);

	

		driver.findElement(By.name("id"))
				.sendKeys(AutoUser());
		 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		
		//driver.findElement(By.cssSelector("label[for='applications-MCAP']")).click();
	//	 driver.findElement(By.cssSelector("label[for='applications-ORDERING']")).click();
		 
		 
	//	 driver.findElement(By.cssSelector("input[value='MCAP']")).sendKeys(Keys.ENTER);
	//	 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='MCAP']"))).sendKeys(Keys.ENTER);
		
	//	 Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='applications-MCAP']")));
		// sel2.selectByValue("MCAP");
		 
	//	 driver.findElement(By.xpath("//body[1]/div[1]/div[3]/form[1]/div[2]/section[1]/div[2]/div[2]/label[2]")).sendKeys(Keys.RETURN);
//		 
//		 WebElement checkBoxDisplayed = driver.findElement(By.cssSelector("label[for='applications-ORDERING']"));
//			boolean isDisplayed = checkBoxDisplayed.isDisplayed();
//			
//			System.out.println(isDisplayed);
//
//			// performing click operation if element is displayed
//			if (isDisplayed == true) {
//				checkBoxDisplayed.sendKeys(Keys.ENTER);
//				System.out.println("inside");
//			}
		 
		 
		 Actions actions = new Actions(driver);
		 actions.moveToElement(driver.findElement(By.cssSelector("label[for='applications-MCAP']"))).click().build().perform();
		 actions.moveToElement(driver.findElement(By.cssSelector("label[for='applications-ORDERING']"))).click().build().perform();
		 actions.moveToElement(driver.findElement(By.cssSelector("label[for='applications-RNA']"))).click().build().perform();
		 actions.moveToElement(driver.findElement(By.cssSelector("label[for='applications-IDB']"))).click().build().perform();
		 actions.moveToElement(driver.findElement(By.cssSelector("label[for='applications-ERA']"))).click().build().perform();
		 actions.moveToElement(driver.findElement(By.cssSelector("label[for='applications-CATALOG']"))).click().build().perform();
			 
//		driver.findElement(By.id("applications-ORDERING")).click();
	//	driver.findElement(By.id("applications-RNA")).click();
//		driver.findElement(By.id("applications-IDB")).click();
//		driver.findElement(By.id("applications-ERA")).click();
//		driver.findElement(By.id("applications-CATALOG")).click();

		driver.findElement(By.name("firstName"))
				.sendKeys("rr");

		driver.findElement(By.name("lastName"))
				.sendKeys("mm");

		driver.findElement(By.name("email"))
				.sendKeys("mm@m.com");

		driver.findElement(By.name("password"))
				.sendKeys("Password@10");
		Thread.sleep(1000); 

		driver.findElement(By.name("employer"))
				.sendKeys("employer should be no 1");
		
		driver.findElement(By.name("accounts"))
		.sendKeys("004039");
		
		driver.findElement(By.xpath("//body/div[@id='root']/footer[1]/button[2]")).click();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS) ;
		//driver.findElement(By.xpath("//body/div[@id='root']/footer[1]/button[2]")).click();
		  driver.findElement(By.xpath("//body/div[@id='root']/footer[1]/button[2]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// driver.quit();
		Thread.sleep(199000); 
		String  u = nm1;
		System.out.println("userid :  " +u);
		db2_advanced.dbase(u);
		System.out.println();
		System.out.println("ALL STEPS COMPLETED SUCCESSFULLY");

	}


}





//driver.findElement(By.cssSelector("div.sc-beqWaB.sc-vjKnw.eLxBgS.ljbxMo:nth-child(1)
		// div.sc-beqWaB.sc-iMfspA.eLxBgS.htsufr:nth-child(2)
		// label.sc-qRumB.bnPfIq.sc-eZYOHW.TPJtt:nth-child(2)
		// div.sc-beqWaB.sc-gHyekI.eLxBgS.gKDGkS:nth-child(2)
		// div.ant-select.sc-lnAgIa.gghEjr.sc-fSCnZK.bAnDKF.without-padding.user-template-selector.ant-select-single.ant-select-open.ant-select-show-search
		// div.ant-select-selector > span.ant-select-selection-item"));

//send something to the input
	//	WebElement input1 = driver.findElement(By.id("rc_select_0"));

		// WebElement
		// input1=driver.findElement(By.className("ant-select-selection-item"));

		// input1.click();

//     		// identify element and enter text


//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		// driver.findElement(By.className("ant-select-item-option-content")).click();

		// WebDriverWait wait = new WebDriverWait(driver, 20);
		// By option = By.xpath(".//div[@class='ant-select-item
		// ant-select-item-option']");

		// By option =
		// By.xpath("//div[@class='ant-select-selection-item']/p/span[contains(text(),'rbmalik3
		// [ravish]')]");
		// wait.until(ExpectedConditions.elementToBeClickable(option)).click();



//l.sendKeys(Keys.TAB);

	// driver.findElement(By.xpath("//div[@class='ant-select-selection-item']")).click();

	// driver.findElement(By.xpath(OR.getProperty("rbmalik3 [ravish]']")).click());
//    	      
	// driver.findElement(By.xpath("//li[text() = 'rbmalik3 [ravish]']")).click();

//    	      input1.click();

	// driver.findElement(By.xpath("//input[contains(@id,
	// 'rc_select_0')]")).sendKeys("rbmalik3" + Keys.ENTER);

	// input1.sendKeys("rb");
	// driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ;
	// input1.sendKeys("mal");
	// driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ;
	// input1.sendKeys("ik3");
	// driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
	// input1.sendKeys("rbmalik3");
	// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	// driver.findElement(By.id("rc_select_0_list"));
	// input1.click();
	// Select dropdown = new Select(input1);
	// dropdown.selectByIndex(0);

	// dropdown.selectByValue("rbmalik3 [ravish]");

//find the drop down element and scroll to that element
	// WebElement options = driver.findElement(By.id("rc_select_0"));
//driver.execute_script("arguments[0].scrollIntoView();", options)

//click that element
//options.click();

	// class="ant-select-selection-item"

	// WebElement testDropDown = driver.findElement(By.id("rc_select_0"));
	// Select dropdown = new Select(testDropDown);
	// dropdown.selectByVisibleText("rbmalik3");

	//// input[@id='rc_select_0']
	// title="rbmalik3 [ravish]"

	// driver.findElement(By.xpath("//span[contains(text(),'rbmalik3 [ravish]"));

	// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/section[1]/label[1]/div[2]/div[1]/div[1]/span[1]/input[1]")).sendKeys("rbmalik3");
