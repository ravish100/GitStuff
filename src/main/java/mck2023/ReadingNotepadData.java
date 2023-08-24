package mck2023;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingNotepadData {
	
	//public static void main(String[] args) throws IOException {

		public static String ReadUser(String UNAME) throws IOException {
		String TestFile = "C:\\Users\\e3ph06j\\eclipse-workspace\\mck23\\userdata2.txt";
		FileReader FR = new FileReader(TestFile);
		BufferedReader BR = new BufferedReader(FR);
		String Content = "";
		String LatestUser="";
		//Loop to read all lines one by one from file and print It.
		while((Content = BR.readLine())!= null){
			System.out.println(Content);
			//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Administrator\\\\Downloads\\\\chromedriver_win32(2)\\\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			//driver.get(Content);
			//String Tittle=driver.getTitle();
			//System.out.println("Tittle of Page is"+ Tittle);
			//String user=content;
			LatestUser=Content;
							
		}
		BR.close();
		
		System.out.println("Final user:"+LatestUser);
UNAME=LatestUser;
return LatestUser;
	}
	
	



}


