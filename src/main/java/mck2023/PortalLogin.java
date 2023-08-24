
package mck2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PortalLogin {
	
		
	public static void LoginWithUser(String NAME) {
	       
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\e3ph06j\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver= new ChromeDriver();
	       
	        driver.get("https://testwcm.mckesson.com/portal/site/smo/template.LOGIN/");
	        
	        

	        
	          driver.findElement(By.id("idp-discovery-username")).sendKeys(NAME);
	          driver.findElement(By.id("idp-discovery-submit")).click();
	          driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	        driver.findElement(By.id("okta-signin-password")).sendKeys("Abcd@123");
	        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
	       
	        driver.findElement(By.id("okta-signin-submit")).click();
	       
	        
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        
	        WebElement element = driver.findElement(By.xpath("//input[@name='hasRead' and @value='true']"));
	        JavascriptExecutor js = (JavascriptExecutor)driver;

	        js.executeScript("arguments[0].click()", element);
	        
	        WebElement element1 = driver.findElement(By.xpath("//input[@name='hasUnderstood' and @value='true']"));
	        JavascriptExecutor js1 = (JavascriptExecutor)driver;

	        js1.executeScript("arguments[0].click()", element1);
	        
	        WebElement element2 = driver.findElement(By.xpath("//input[@name='hasAgreed' and @value='true']"));
	        JavascriptExecutor js2 = (JavascriptExecutor)driver;

	        js2.executeScript("arguments[0].click()", element2);
	        
	        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
	        
	        
	        WebElement element3 = driver.findElement(By.xpath("//input[@name='4']"));
	        JavascriptExecutor js3 = (JavascriptExecutor)driver;

	        js3.executeScript("arguments[0].click()", element3);
	        
	        //driver.findElement(By.name("4")).click();
	        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
	        
	       
	        
	        driver.findElement(By.xpath("//input[@value='OK']")).submit();
	        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
	        
	       // McapVerificaiton.LoginMcap();
	        
	        /////only mcap
	        
	        driver.findElement(By.xpath("//a[@id='lnk3']")).click();
	        
		       // driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		        
		        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[4]/table/tbody/tr/td/div/table/tbody/tr/td[1]/ul/li[2]/a")).click();
		    //    driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
		        
		        String strUrl = driver.getCurrentUrl();
		        System.out.println("Current Url is:"+ strUrl);
		        
		        String substr1 = strUrl.substring(strUrl.length() - 3);
		        
		        System.out.println("MCAP SYSTEM IS:"+ substr1);
		        if (substr1.equals("FQA"))
		        {
		        	System.out.println("We Are successfully able to hit AM2 URL");
		        }

		        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS) ;
	        ////mcap end
		        
		        
	        
	        driver.findElement(By.xpath("//a[@id='lnk1']")).click();
	        
	        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
	        
	        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/ul[1]/li[2]/a[1]")).click();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        
	        
	  
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
	        
	     	        System.out.println("Found drop down");
	        System.out.println(driver.getClass());
	            new WebDriverWait(driver, 5);
	            
           
	         //   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	                     
	            
			  Select entriesDropDown = new Select(entriesDropDownLocator);
			  
			 
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
	        
	
	        
	         driver.quit();
}
}
