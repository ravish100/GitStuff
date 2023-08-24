package mck2023;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Files.EditPayload;

public class RNAVerificaiton {

//	public static void main(String[] args) {
	
	public static void RNAUser(String NAME) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32(3)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
       
        driver.get("https://testwcm.mckesson.com/portal/site/smo/template.LOGIN/");

      

        driver.manage().window().maximize();
          driver.findElement(By.id("idp-discovery-username")).sendKeys("uatadmin");
          driver.findElement(By.id("idp-discovery-submit")).click();
          driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
        driver.findElement(By.id("okta-signin-password")).sendKeys("Password@10");
       // driver.findElement(By.id("btnLogin")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("okta-signin-submit")).click();

        
       
        
driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
        
        //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/a[1]")).click();
       driver.findElement(By.xpath("//a[@id='lnk8']")).click();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
       // System.out.println("reached here");
        driver.findElement(By.xpath("//a[contains(text(),'User Search')]")).click();
        
        
      //  WebDriverWait wait = new WebDriverWait(driver, timeout);
      //  wait.until(ExpectedConditions.visibilityOf(element)); 
       // wait.until(ExpectedConditions.elementToBeClickable(element));
     //     driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[9]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).click();
        
       // driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
        
        driver.findElement(By.xpath("//input[@id='userID']")).sendKeys(NAME);
        driver.findElement(By.xpath("//tbody/tr[3]/td[11]/input[1]")).click();
      driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/form[2]/table[2]/tbody[1]/tr[2]/td[12]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/font[1]")).click();
        
    
        
      //  String strUrl = driver.getCurrentUrl();
       // System.out.println("Current Url is:"+ strUrl);
        
       // String substr1 = strUrl.substring(strUrl.length() - 3);
        
        //System.out.println("MCAP SYSTEM IS:"+ substr1);
        //if (substr1.equals("FQA"))
     //   {
     //   	System.out.println("We Are successfully able to hit AM2 URL");
    //    }
        
        
        
        WebElement entriesDropDownLocator = driver.findElement(By.xpath("//select[@name='ENABLED_FIELDS_LIST']"));
        
	        System.out.println("Found enabled func code list:)");
//System.out.println(driver.getClass());
    new WebDriverWait(driver, 5);
    

 //   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
             
    
  Select entriesDropDown = new Select(entriesDropDownLocator);
  
 
  List<WebElement> actualDropDownValues = entriesDropDown.getOptions();
 // System.out.println(actualDropDownValues.size());
  System.out.println("Actual values coming from R&A admin: ");
  for (WebElement actualValues : actualDropDownValues) {
	   System.out.println(actualValues.getAttribute("value"));
  }
  
  @SuppressWarnings("serial")
  List<String> expectedDropDownValues = new ArrayList<String>()
         { 
            { 
            	add("999");
            	 add("2");
            	 add("3");
            	
            }
         };
         
         
  System.out.println("Expected values from R&A admin screen:");
            
  
  for (String expectedOptions : expectedDropDownValues) {
      System.out.println(expectedOptions.toString());
}
System.out.println("Compare the actual values with the expected values ");

for(int i=0;i<actualDropDownValues.size();i++) {

 if(actualDropDownValues.get(i).getAttribute("value").equals(expectedDropDownValues.get(i).toString())) {
  
  System.out.println("Value Matching :"+"Actual List Value="+actualDropDownValues.get(i).getAttribute("value")+" And Expected Value="+expectedDropDownValues.get(i));
 }else {
  System.out.println("Value Not Matching :"+"Actual List Value="+actualDropDownValues.get(i).getAttribute("value")+" And Expected Value="+expectedDropDownValues.get(i));
 }
}


driver.quit();
//driver.close();
}




	}


