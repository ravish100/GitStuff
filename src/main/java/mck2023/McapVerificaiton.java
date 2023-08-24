package mck2023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class McapVerificaiton {

	public static void main(String[] args) {
	//public static void LoginMcap(String NAME) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32(2)\\chromedriver.exe");
	        WebDriver driver= new ChromeDriver();
	       
	        driver.get("https://testwcm.mckesson.com/portal/site/smo/template.LOGIN/");

	        //System.out.println("Browser Tile is : "+ aTitle) ;
	       // driver.findElement(By.xpath("//*[@id=\"formsubmit\"]/table/tbody/tr[8]/td[1]/input")).click();
//	      List<WebElement> we= driver.findElements(By.name("yourname"));
//	      we.get(1).sendKeys("divisha");

	        driver.manage().window().maximize();
	          driver.findElement(By.id("idp-discovery-username")).sendKeys("n00025");
	          driver.findElement(By.id("idp-discovery-submit")).click();
	          driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	        driver.findElement(By.id("okta-signin-password")).sendKeys("Abcd@123");
	       // driver.findElement(By.id("btnLogin")).sendKeys(Keys.ENTER);
	        driver.findElement(By.id("okta-signin-submit")).click();
	       // driver.quit(); 
	        
	        //driver.findElement(By.name("hasRead")).get("yes").click();
	       // driver.findElement(By.name("hasUnderstood")).click();
	        //driver.findElement(By.name("hasAgreed")).click();
	        
//driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
	        
	      //  driver.findElement(By.xpath("//*[@id=\"lnk3\"]")).click();
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

	}

}
