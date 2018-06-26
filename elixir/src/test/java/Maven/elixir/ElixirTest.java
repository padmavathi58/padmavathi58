package Maven.elixir;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class ElixirTest {
	WebDriver driver;
  @Test(priority=2)
  public void f() {
	  driver.quit();
  }
  @BeforeClass
  public void browser() {
		System.setProperty("webdriver.chrome.driver", "//Users//padmavathigonugunta58gmail.com//Desktop//selenium dump//chromedriver");
	    driver=new ChromeDriver();
	    driver.get("http://demo.elixiraid.com/index.php");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("UserLogin_username")).sendKeys("admin");
	    driver.findElement(By.id("UserLogin_password")).sendKeys("admin");
	    driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/form/div[4]/input")).click();
	    
	}
  @Test(priority=0)
	public void dashboard() {
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[3]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[3]/ul/li[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_hospital_code\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_hospital_code\"]")).sendKeys("417");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_hospitalname\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_hospitalname\"]")).sendKeys("padmavathi super speciality");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_address\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_address\"]")).sendKeys("15/3/30,gandhiroad,ongole");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_yearofestablishment\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_yearofestablishment\"]")).sendKeys("2018");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_country\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_country\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_state\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_state\"]")).sendKeys("Andhra pradesh");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_phone\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_phone\"]")).sendKeys("9948499419");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_email\"]")).sendKeys("mounimaha11@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_fax\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_fax\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_noofbuildings\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_noofbuildings\"]")).sendKeys("8");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_contactperson\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_contactperson\"]")).sendKeys("kiran");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_promotedby\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_promotedby\"]")).sendKeys("padma");
		//driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_logo\"]")).click();
	
	}
	@Test(priority=1)
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul[2]/li/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul[2]/li/ul/li[2]/a")).click();
	}

	    
  }


