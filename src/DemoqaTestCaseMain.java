import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

/**
 * 
 * The main java file for DemoqaTestCaseMain. 
 * This class connects to a website and automatically fills in the fields to test the page.
 * 
 * @author Jeremiah Doody
 */
public class DemoqaTestCaseMain 
{
	
	/**
	 * Main method accesses demoqa.com/registration page and automates the signup 
	 * procedure using a fake client. 
	 * 
	 * @param args
	 * @return none
	 */
	public static void main(String[] args) 
	{
		//setup driver
		File file = new File("./lib/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		WebDriver driver = new FirefoxDriver();
		
		//get website to test
		driver.get("http://demoqa.com/registration/");
		
		//set name (first and last)
		driver.findElement(By.id("name_3_firstname")).sendKeys("Jay");
		driver.findElement(By.id("name_3_lastname")).sendKeys("Exampleton");
		
		driver.findElement(By.name("radio_4[]")).click();
	    driver.findElement(By.xpath("(//input[ @name='checkbox_5[]' ]) [2]")).click();
		
		//set country
	    driver.findElement(By.id("dropdown_7")).sendKeys("Austria");
	    
  	    //set birthdate
	    driver.findElement(By.id("mm_date_8")).sendKeys("5");
	    driver.findElement(By.id("dd_date_8")).sendKeys("6");
	    driver.findElement(By.id("yy_date_8")).sendKeys("1956");

	    //set phone number (no spaces)
	    driver.findElement(By.id("phone_9")).sendKeys("19045557555");
	    
	    //set username
	    driver.findElement(By.id("username")).sendKeys("MrWise9");
	    
	    //set email
	    driver.findElement(By.id("email_1")).sendKeys("mrwise9@email.com");
	    
	    //set profile description
	    driver.findElement(By.id("description")).sendKeys("I am Mr. Wise.");
	    
	    //set password
	    String password = "Ag6W&@;]f5";
	    driver.findElement(By.id("password_2")).clear();
	    driver.findElement(By.id("password_2")).sendKeys(password);
	    driver.findElement(By.id("confirm_password_password_2")).clear();
	    driver.findElement(By.id("confirm_password_password_2")).sendKeys(password);
	    
	    //submit form
	    driver.findElement(By.name("pie_submit")).click();
		
	}//end main method
	
	
}//end class
