package A_3webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_2Close {
	
	public static void main(String[] args) throws InterruptedException
	{		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
				
		Thread.sleep(2000);     //diffclassname.methodname(time in mili sec);
	
		driver.close();
	}

}