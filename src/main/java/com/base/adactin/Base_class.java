package com.base.adactin;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
public static WebDriver driver;
public static String value;
public static WebDriver browser_configuration(String type)
{
	if(type.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Cucumber_Adactin\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	return driver;
}	
public static void click(WebElement element)
{
	element.click();	
}
public static void clear(WebElement element)
{
	element.clear();
}
public static void sendkeys(WebElement element,String data)
{
	element.sendKeys(data);
}
public static void geturl(String url)
{
	driver.get(url);
}
public static void navigate(String url)
{
	driver.navigate().to(url);
}
public static void wait(long time,TimeUnit unit)
{
	driver.manage().timeouts().implicitlyWait(time, unit);
}
public static void dropdown(String type,WebElement element,String data)
{
	try {
		Select s=new Select(element);
		if(type.equalsIgnoreCase("byvalue"))
		{
			s.selectByValue(data);
		}
		else if(type.equalsIgnoreCase("bytext"))
		{
			s.selectByVisibleText(data);
		}
		else
		{
			int index=Integer.parseInt(data);
			s.selectByIndex(index);
		}
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
		
}
public static void screenshot(String image) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dst=new File("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Screenshot\\"+image);
	FileHandler.copy(src, dst);
}
public static void scroll(WebElement element)
{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)",element);
}
public static void alert(String type)
{
	Alert a=driver.switchTo().alert();
	if(type.equalsIgnoreCase("accept"))
	{
		a.accept();
	}
	else if(type.equalsIgnoreCase("prompt"))
	{
		a.sendKeys("alert");
		a.accept();
	}
	else
	{
		a.dismiss();
		
	}
}
	public static void mouse_hover(WebElement element)
	{
		Actions a=new Actions(driver); 
		a.moveToElement(element).perform();
	}
	public static void frame_in(int n)
	{
		driver.switchTo().frame(n);
	}
	public static void frame_out()
	{
		driver.switchTo().defaultContent();
	}
	public static void javascript()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,400)","");
	}
	public static void window_handles(int index)
	{
		Set<String>handles=  driver.getWindowHandles();
		List<String>window=new ArrayList<String>(handles);
		driver.switchTo().window(window.get(index));
		driver.manage().window().maximize();
	}
	public static void close()
	{
		driver.close();
	}
	public static void quit()
	{
		driver.quit();
	}
public static String particular_celldata(String path,int row_index,int cell_index) throws IOException
{
	File f=new File(path);
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	Sheet s=wb.getSheetAt(0);
	Row r=s.getRow(row_index);
	Cell c=r.getCell(cell_index);
	CellType type=c.getCellType();
	if(type.equals(CellType.STRING))
	{
		value=c.getStringCellValue();
		System.out.println(value);
	}
	else if(type.equals(CellType.NUMERIC))
	{
		double d=c.getNumericCellValue();
		int n=(int) d;
		 value=String.valueOf(n);
		System.out.println(value);	
	}
	return value;
	
	
}

				
	

}
