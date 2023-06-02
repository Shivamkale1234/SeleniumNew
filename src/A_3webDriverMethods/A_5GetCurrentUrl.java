package A_3webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_5GetCurrentUrl {
	
	public static void main(String[] args)
	{		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//System.out.println(driver.getCurrentUrl());		
	}

}
