package vijay;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FitPeo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://fitpeo.com/");
	WebElement revenuecalculator=	driver.findElement(By.partialLinkText("Revenue"));
		revenuecalculator.click();
		
		WebElement slider = driver.findElement(By.xpath("//input[@aria-orientation='horizontal']"));
		
		
		
		for (; ;) {
			if(slider.getAttribute("value").contains("820")) {
			break;
			}
			slider.sendKeys(Keys.ARROW_RIGHT);
		}
		
		WebElement textfield = driver.findElement(By.xpath("//input[@type='number']"));
		
		if(textfield.getAttribute("value").equals("820"))
		{
			System.out.println("Text value is updated to 820");
		}
		
		textfield.click();
		textfield.click();
		textfield.sendKeys("560");
		
		if(textfield.getAttribute("value").equals("560"))
		{
			System.out.println("Textfield updated to 560");
		}
		Thread.sleep(1000);
		  driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		  driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		Thread.sleep(2000);
		
		WebElement reimbursementHeader = driver.findElement(By.xpath("(//p[contains(@class,'MuiTypography')])[7]"));
		
		if(reimbursementHeader.getText().contains("$110700")) {
			System.out.println("Total recurring reimbursement is correct :$110700");
		
		}
		else
		{
			System.out.println("Total recurring reimbursement is incorrect");
		}
		driver.close();
	}
}
