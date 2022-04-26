package com.property.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Adactin_Configuration_Reader {
	public static Properties p;
	public Adactin_Configuration_Reader() throws IOException
	{
		File f=new File("C:\\Users\\Gayathri\\eclipse-workspace\\Cucumber_Adactin\\src\\main\\java\\com\\testdata\\property\\Configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		 p=new Properties();
		p.load(fis);	
	}
	public String get_Instance_url()
	{
		String url=p.getProperty("url");
		return url;
	}
	public String get_Instance_username()
	{
		String username=p.getProperty("username");
		return username;
	}
	public String get_Instance_password()
	{
		String password=p.getProperty("password");
		return password;	
	}
	public String get_Instance_checkin()
	{
		String checkin=p.getProperty("checkin");
		return checkin;
	}
	public String get_Instance_checkout()
	{
		String checkout=p.getProperty("checkout");
		return checkout;
	}
	public String get_Instance_firstname()
	{
		String firstname=p.getProperty("first_name");
		return firstname;
	}
	public String get_Instance_lastname()
	{
		String lastname=p.getProperty("last_name");
		return lastname;
	}
	public String get_Instance_address()
	{
		String address=p.getProperty("address");
		return address;
	}
	public String get_Instance_creditcard()
	{
		String credit=p.getProperty("credit_card");
		return credit;
	}
	public String get_Instance_cvv()
	{
		String cvv=p.getProperty("cvv");
		return cvv;
	}

}
