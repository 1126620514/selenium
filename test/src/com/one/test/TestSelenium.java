package com.one.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Firefox浏览器是自定义安装，启动Firefox 的webdriver代码
		//System.setProperty("webdriver.firefox.bin", "F:/Mozilla firefox/firefox.exe"); 
	    //WebDriver driver = new FirefoxDriver(); 
		//IE浏览器是自定义安装，启动IE webdriver的代码
//		System.setProperty("webdriver.internetexplorer", "C:/Program Files (x86)/Internet Explorer/iexplore.exe");
//		WebDriver driver = new InternetExplorerDriver ();
		//启动goole webdriver的代码
		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.baidu.com/";
		driver.get(url);
	}
}
