package com.sgtest.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {
	public static WebDriver fbrowser=null;
	public static void main(String[] args) {
		ffirebox();
		ffirefox1();
		ffirefox2();
	}
	private static void ffirebox()
	{
		try {
			fbrowser=new FirefoxDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void ffirefox1()
	{
		try {
			fbrowser.get("https://www.selenium.dev/downloads/");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void ffirefox2()
	{
		try {
			fbrowser.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
