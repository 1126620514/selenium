package com.one.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Firefox��������Զ��尲װ������Firefox ��webdriver����
		//System.setProperty("webdriver.firefox.bin", "F:/Mozilla firefox/firefox.exe"); 
	    //WebDriver driver = new FirefoxDriver(); 
		//IE��������Զ��尲װ������IE webdriver�Ĵ���
//		System.setProperty("webdriver.internetexplorer", "C:/Program Files (x86)/Internet Explorer/iexplore.exe");
//		WebDriver driver = new InternetExplorerDriver ();
		//����goole webdriver�Ĵ���
		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.baidu.com/";
		driver.get(url);
	}
}
