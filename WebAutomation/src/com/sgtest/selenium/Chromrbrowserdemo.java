package com.sgtest.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromrbrowserdemo {

	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		url();
		close();
	}
	private static void launchbrowser()
	{
		try {
			obrowser=new ChromeDriver();


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void url()
	{
		try {
			obrowser.get("http://localhost/login.do");
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	private static void close()
	{
		try {
			obrowser.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
