//package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	 //定义FireFox的路径
	 System.setProperty ( "webdriver.firefox.bin" , "C:/Program Files/Firefox/firefox.exe" ); 
    //生成一个FireFox的WebDriver，即生成一个浏览器对象
	 driver = new FirefoxDriver();
    
	 baseUrl = "http://www.baidu.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSelenium() throws Exception {
	  //get表示打开一个url地址
    driver.get(baseUrl);
    //driver.findElement表示找到一个控件元素，也就是taget。clear就是IDE中的command
    //kw1就是搜索框控件，clear进行字符清除，sendKeys表示输入字符
    driver.findElement(By.id("kw1")).clear();
    driver.findElement(By.id("kw1")).sendKeys("selenium");
    driver.findElement(By.id("su1")).click();
  }

  @After
  public void tearDown() throws Exception {
	  //关闭浏览器
    //driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
