package se.iths;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ShopTest {
	
	WebDriver driver;
	
	@Before
	
	public void setup() {
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumGecko\\geckodriver.exe");
		 driver = new FirefoxDriver();
		
	}
	
	@After
	
	public void setup2(){
		
		driver.close();
	}
	
	@Test
	public void selectBook() throws InterruptedException{
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath(("//*[contains(@src, 'google')]")));
		book.click();
		
		Thread.sleep(2000);
		assertEquals("The Big Switch", driver.getTitle());
		
		}
	
	@Test
	public void selectBook2() throws InterruptedException{
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath(("//*[contains(@src, 'spring')]")));
		book.click();
		
		Thread.sleep(2000);
		assertEquals("Spring in Action", driver.getTitle());
		
			
		}
	
	@Test
	public void selectBook3(){
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath(("//*[contains(@src, 'node')]")));
		book.click();
			
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertEquals("Node Web Development", driver.getTitle());
		
		}
		
	@Test
	public void searchField(){
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath((".//*[@id='searchField']")));
		book.click();
			
		}
	
	@Test
	public void shoppingCart(){
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath((".//*[@id='open-cart']")));
		book.click();
			
		}
	
	@Test
	public void signInButton(){
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath((".//*[@id='customerAccount']/button")));
		book.click();
		
		
			
		}
		
	@Test
	public void contactUs() throws InterruptedException{
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath((".//*[@id='footer-section']/div[2]/div/div[3]/div/ul/li[4]/a")));
		book.click();
		
		Thread.sleep(2000);
		
		WebElement book2 = driver.findElement(By.className("contact-title"));
		
		assertEquals("Contact us",book2.getText());
		
		
		
	}  
	
	@Test
	public void selectBook1AddToCart() throws InterruptedException{
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath(("//*[contains(@src, 'google')]")));
		book.click();
		
		Thread.sleep(2000);  
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		WebElement book2 = driver.findElement(By.xpath((".//*[@id='input-6']/div/button")));
		book2.click();
		 
		Thread.sleep(2000); 
		
		Actions actions1 = new Actions(driver);
		actions1.keyUp(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("open-cart")));
		
		WebElement book3 = driver.findElement(By.id("open-cart"));
		
		book3.click();
		
		Thread.sleep(2000);
		 
		WebElement book4= driver.findElement(By.xpath(".//*[@id='miniCartDetails']/li/div/a"));
		book4.click();
		
		Thread.sleep(2000);
		
		WebElement book5 = driver.findElement(By.xpath((".//*[@id='mainCartTable']/tbody/tr[1]/td[5]/button")));
		book5.click();
		
	} 
	
	@Test
	public void selectComputerBooks(){
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		WebElement book = driver.findElement(By.xpath((".//*[@id='footer-section']/div[2]/div/div[3]/div/ul/li[2]/a/span")));
		book.click();
		
		}
	
	@Test
	
	public void testGoToDefaultStore() throws InterruptedException {
		
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		
		WebElement storeLink = driver.findElement(By.linkText("Default store"));
		
		storeLink.click();
		
		Thread.sleep(2000);
		
		assertEquals("Shopizer Demo - Default store", driver.getTitle());
		
	} 
		
	
		
		}
	
	

