import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.firefoxdriver().setup();
     WebDriver driver = new FirefoxDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
     
     
     WebElement createUserAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
     createUserAccount.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("firstname")).sendKeys("");
	driver.findElement(By.name("lastname")).sendKeys("");
	driver.findElement(By.name("reg_email__")).sendKeys("");
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("");
	driver.findElement(By.name("reg_passwd__")).sendKeys("");
	
	WebElement selectDayEle = driver.findElement(By.id("day"));
	Select daydrop = new Select(selectDayEle) ;
	daydrop.selectByVisibleText("24");
	
	WebElement selectMonthEle = driver.findElement(By.id("month"));
	Select monthdrop = new Select(selectMonthEle);
	monthdrop.selectByValue("1");
	
	
	WebElement selectYearEle = driver.findElement(By.id("year"));
	Select yeardrop = new Select(selectYearEle);
	yeardrop.selectByIndex(28);
	
	WebElement genderEle = driver.findElement(By.xpath("//label[text()='Female']//following-sibling::input[@value='1']"));
	genderEle.click();
	
	WebElement signUpEle = driver.findElement(By.xpath("//div[@class='_1lch']//child::button[text()='Sign Up']"));
	signUpEle.click();
	}

}
