package mck2023;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


//https://community.jaspersoft.com/blog/how-compare-displayed-drop-down-select-valuesactual-values-displayed-are-matching-user-expected
public class compare extends PortalLogin2 {
	
	public static WebDriver driver;

	 public static void compareDispalyedRowCountToActualRowCount() throws Exception {
		 
		  @SuppressWarnings("serial")
		  List<Integer> expectedDropDownValues = new ArrayList<Integer>()
		         { 
		            { 
		              //  add(096206); 
		             //   add(000078); 
		                add(241654); 
		                add(553183);
		                add(283044);
		                add(878586);
		                
		            } 

		         };
		         
		  System.out.println("Expected dropdown values for accounts table");
		         
		  for (Integer expectedOptions : expectedDropDownValues) {
		          System.out.println(expectedOptions.toString());
		   }
		            
		  WebElement entriesDropDownLocator = driver.findElement(By.xpath("//select[@id='create-mckesson-order-dropdown']"));
		  
		  Select entriesDropDown = new Select(entriesDropDownLocator);
		  List<WebElement> actualDropDownValues = entriesDropDown.getOptions();
		  
		  System.out.println("Actual dropdown values from accounts table");
		  for (WebElement actualValues : actualDropDownValues) {
		   System.out.println(actualValues.getText());
		  }
		  System.out.println("Compare the actual values with the expected values for dropdown");
		    
		  for(int i=0;i<actualDropDownValues.size();i++) {
		   
		     if(actualDropDownValues.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
		      
		      System.out.println("Value Matching :"+"Actual List Value="+actualDropDownValues.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i));
		     }else {
		      System.out.println("Value Not Matching :"+"Actual List Value="+actualDropDownValues.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i));
		     }
		  }
		 }
		 
		 public void closeDriver() {
		  driver.close();
		 }
		 public void quitDriver() {
		  driver.quit();
		 }
		 
		 public static void main(String[] args) throws Exception {
		  
			 compare c = new compare();
		   
		   System.setProperty("webdriver.chrome.driver", "D:\\006_trainings\\chromedriver.exe");
		   System.setProperty("webdriver.chrome.silentOutput","true" );
		  
		   driver = new ChromeDriver();
		   driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");
		   driver.manage().window().maximize();
		   c.compareDispalyedRowCountToActualRowCount();
		   
		   c.closeDriver();
		   c.quitDriver();
		 }
		}
	

