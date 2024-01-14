package Steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Guru99Steps {
	public static WebDriver driver;
	
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	}
	
	@When("Enter details firstName and lastName")
	public void enter_details_first_name_and_last_name(DataTable dataTable) {
	  List<List<String>> ls=dataTable.cells();
	  String fName = ls.get(0).get(0);
	  
	  List<List<String>> ls1=dataTable.asLists();
	  String Lname=ls1.get(0).get(1);
	 driver.findElement(By.name("firstName")).sendKeys(fName);
	 driver.findElement(By.name("lastName")).sendKeys(Lname);
	
	 
	}

	@When("Enter details {string} and {string}")
	public void enter_details_and(String Address, String City) {
		
		driver.findElement(By.name("address1")).sendKeys(Address);
		driver.findElement(By.name("city")).sendKeys(City);
	   
	}

	@When("Enter details userName and password")
	public void enter_details_user_name_and_password(DataTable dataTable) {
		List<Map<String, String>>map= dataTable.asMaps();
		String un=map.get(0).get("userName");
		String Pass=map.get(0).get("password");
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(Pass);
	   
	}

}
