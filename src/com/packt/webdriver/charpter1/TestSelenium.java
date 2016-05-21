package com.packt.webdriver.charpter1;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSelenium {
	public static void main(String[] args){
		WebDriver  driver= new FirefoxDriver();
		driver.get("http://www.baidu.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Cheese");
		element.submit();
		System.out.print("page title is"+driver.getTitle());
		( new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>() {
			public void Booleanapply(WebDriver d){
				RemoteWebDriver returnd = null;
				returnd.getTitle().toLowerCase().startsWith("cheese");
			}

			@Override
			public Boolean apply(WebDriver arg0) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		System.out.println("page title is"+driver.getTitle());
		driver.quit();
	}

}
