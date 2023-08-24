
package mck2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PortalLogin2 {
	
	
	
	
	 public static void main(String[] args) throws Exception {
	
	//public static String LoginWithUser1() {
	       
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32(2)\\chromedriver.exe");
	        WebDriver driver= new ChromeDriver();
	       
	        driver.get("https://testwcm.mckesson.com/portal/site/smo/template.LOGIN/");

	        //System.out.println("Browser Tile is : "+ aTitle) ;
	       // driver.findElement(By.xpath("//*[@id=\"formsubmit\"]/table/tbody/tr[8]/td[1]/input")).click();
//	      List<WebElement> we= driver.findElements(By.name("yourname"));
//	      we.get(1).sendKeys("divisha");

	        driver.manage().window().maximize();
	          driver.findElement(By.id("idp-discovery-username")).sendKeys("n00015");
	          driver.findElement(By.id("idp-discovery-submit")).click();
	          driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	        driver.findElement(By.id("okta-signin-password")).sendKeys("Abcd@123");
	       // driver.findElement(By.id("btnLogin")).sendKeys(Keys.ENTER);
	        driver.findElement(By.id("okta-signin-submit")).click();
	       // driver.quit(); 
	        
	        //driver.findElement(By.name("hasRead")).get("yes").click();
	       // driver.findElement(By.name("hasUnderstood")).click();
	        //driver.findElement(By.name("hasAgreed")).click();
	        
	        
//	       WebElement radio_b1 = driver.findElement(By.xpath("//input[@name='hasRead' and @value='true']"));
//	        radio_b1.click();
//	        WebElement radio_b2 = driver.findElement(By.xpath("//input[@name='hasUnderstood' and @value= 'true']"));
//	        radio_b2.click();
//	        WebElement radio_b3 = driver.findElement(By.xpath("//input[@name='hasAgreed' and @value='true']"));
//	        radio_b3.click();
	        
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//	        
//	        WebElement element = driver.findElement(By.xpath("//input[@name='hasRead' and @value='true']"));
//	        JavascriptExecutor js = (JavascriptExecutor)driver;
//
//	        js.executeScript("arguments[0].click()", element);
//	        
//	        WebElement element1 = driver.findElement(By.xpath("//input[@name='hasUnderstood' and @value='true']"));
//	        JavascriptExecutor js1 = (JavascriptExecutor)driver;
//
//	        js1.executeScript("arguments[0].click()", element1);
//	        
//	        WebElement element2 = driver.findElement(By.xpath("//input[@name='hasAgreed' and @value='true']"));
//	        JavascriptExecutor js2 = (JavascriptExecutor)driver;
//
//	        js2.executeScript("arguments[0].click()", element2);
//	        
//	        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//	        
//	        
//	        WebElement element3 = driver.findElement(By.xpath("//input[@name='4']"));
//	        JavascriptExecutor js3 = (JavascriptExecutor)driver;
//
//	        js3.executeScript("arguments[0].click()", element3);
//	        
//	        //driver.findElement(By.name("4")).click();
//	        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//	        
//	       
//	        
//	        driver.findElement(By.xpath("//input[@value='OK']")).submit();
	        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
	        
	        driver.findElement(By.xpath("//a[@id='lnk1']")).click();
	        
	        //driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
	        
	        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/ul[1]/li[2]/a[1]")).click();
	        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
	    //    driver.findElement(By.xpath("//input[@text='096206 - SCHAEFER DRUG INC']")).click();
	    //  compare.compareDispalyedRowCountToActualRowCount();
	        
	   
//driver.findElement(By.xpath("//body/main[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]")).click();
	        
	  //      driver.findElement(By.xpath("//input[@id='create-mckesson-order-dropdown' and @value='096206']"));
	        
//	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32(2)\\chromedriver.exe");
//	        WebDriver driver1= new ChromeDriver();
//	       
//	        driver.get("https://uat-z1-fconnect.mckesson.com/mckessonstorefront/order/new?&iamSessionId=AQIC5wM2LY4SfcxiFTOW3GtFw-jNqKj4PpLbuThCETwwtLk.*AAJTSQACMDIAAlNLABQtODI2ODg1MjIxOTY4ODY2MDE4MQACUzEAAjAz*&userId=5LDAQChy4t8wdH2XfkK%2B%2FQ==");
//	       
	      //  driver.switchTo().frame("1");
	        
	        




//private void openInNewTabAndSwitch(WebElement linkElement) 
//{
//    String parentTab = driver.getWindowHandle();
//    Actions newTab = new Actions(driver);
//    newTab.keyDown(Keys.CONTROL).click(linkElement).keyUp(Keys.CONTROL).build().perform();
//    WebDriverWait wait = new WebDriverWait(driver,5);
//    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//    Set<String> windowSet = driver.getWindowHandles();
//    for(String tab:windowSet)
//    {
//        if(!parentTab.equalsIgnoreCase(tab))
//        {
//            driver.switchTo().window(tab);
//            //do your work in the newly opened TAB
//        }
//    }
//}
	        
	        
	        //JavascriptExecutor js = (JavascriptExecutor) driver;
	       // js.executeScript("window.open('','_blank');");


	        String parentWindow = driver.getWindowHandle();
	        Set<String> tabs = (Set<String>)driver.getWindowHandles();
	        System.out.println(tabs.size());
	        for(String tab : tabs)
	        {
	            if(!tab.equals(parentWindow)) //switch only if it's not parent window
	           driver.switchTo().window(tab);
	            driver.get("https://uat-z1-fconnect.mckesson.com/mckessonstorefront/order/new?&iamSessionId=AQIC5wM2LY4SfczS3QMTeRdOYSiZlB04tWxLhj_e8LL745s.*AAJTSQACMDIAAlNLABQtNTAwMDExNjk4NzQ3MjE5OTEzMwACUzEAAjAz*&userId=wDBp9KQ8Lc2H2YdSfZz79g==");
	            System.out.println(driver.getTitle());
	            //do some other validation
	      
	        
	        driver.switchTo().window(parentWindow);

	          WebElement entriesDropDownLocator = driver.findElement(By.xpath("//select[@name='selectedAccount']"));
	        
	      //  WebElement entriesDropDownLocator = driver.findElement(By.xpath("//body/main[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]"));
			  
	        System.out.println("hii");
	        System.out.println(driver.getClass());
	            new WebDriverWait(driver, 10);
	            
	            //elementToBeClickable
	            
	            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	            
	          //w  driver.findElement(By.id("poNumber")).sendKeys("123");
		          
		    //w      driver.findElement(By.xpath("//body/main[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
	            
			  Select entriesDropDown = new Select(entriesDropDownLocator);
			  
			  //entriesDropDown.selectByValue("553183 - LOGAN HEALTH MAT MNGT");
			  
			  //entriesDropDown.selectByIndex(0);
			  List<WebElement> actualDropDownValues = entriesDropDown.getOptions();
			 // System.out.println(actualDropDownValues.size());
			  System.out.println("Actual dropdown values from accounts table");
			  for (WebElement actualValues : actualDropDownValues) {
				   System.out.println(actualValues.getAttribute("value"));
			  }
			  
			  @SuppressWarnings("serial")
			  List<String> expectedDropDownValues = new ArrayList<String>()
			         { 
			            { 
			            	 add("241654");
			            	 add("000078");
			            	 add("283044");
			            	  
			               	                
			                add("553183");
			               
			                add("878586");
			                add("096206");
			            } 

			         };
			         
			  System.out.println("Expected dropdown values for accounts table");
			         
			  for (String expectedOptions : expectedDropDownValues) {
			          System.out.println(expectedOptions.toString());
			   }
			  System.out.println("Compare the actual values with the expected values for dropdown");
			    
			  for(int i=0;i<actualDropDownValues.size();i++) {
			   
			     if(actualDropDownValues.get(i).getAttribute("value").equals(expectedDropDownValues.get(i).toString())) {
			      
			      System.out.println("Value Matching :"+"Actual List Value="+actualDropDownValues.get(i).getAttribute("value")+" And Expected Value="+expectedDropDownValues.get(i));
			     }else {
			      System.out.println("Value Not Matching :"+"Actual List Value="+actualDropDownValues.get(i).getAttribute("value")+" And Expected Value="+expectedDropDownValues.get(i));
			     }
			  }
			 }
	        
		          
		      // new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable((By.xpath("//select[@id='create-mckesson-order-dropdown']")))

		          // expand housing type dropdown using javascript
		       //   dropdown_trigger = driver.find_element_by_xpath("//label[contains(@class, 'create-mckesson-order-dropdown')]/span/span[contains(@class, 'k-input')]")
		      //    driver.execute_script("arguments[0].click();", dropdown_trigger)

		          // select an option -- this selects 'flat'
		       //   dropdown_option = WebDriverWait(driver, 15).until(EC.presence_of_element_located((By.XPATH, "//li[text()='flat']")))
		       //   dropdown_option.click()
		          
		          
	        } 
}


//driver.switchTo().activeElement()

//https://stackoverflow.com/questions/59534665/element-not-interactable-element-is-not-currently-visible-and-may-not-be-manipu
