package com.object;

import org.openqa.selenium.WebDriver;

import com.pom.Adactin_bookhotel;
import com.pom.Adactin_homepg;
import com.pom.Adactin_itinerary;
import com.pom.Adactin_search_hotel;
import com.pom.Adactin_selectpg;

public class Page_obj_manager_adactin {
	public static WebDriver driver;
	private Adactin_homepg hp;
	public Page_obj_manager_adactin(WebDriver driver2) {
		this.driver=driver2;
	}
	public Adactin_homepg get_instance_hp()
	{
		if(hp==null)
		{
			hp=new Adactin_homepg(driver);
		}
		return hp;	
	}
	private Adactin_search_hotel search;
	public Adactin_search_hotel get_Instance_search()
	{
		if(search==null)
		{
			search=new Adactin_search_hotel(driver);
		}
		return search;	
	}
	private Adactin_selectpg selpg;
	public Adactin_selectpg get_Instance_selpg()
	{
		if(selpg==null)
		{
			selpg=new Adactin_selectpg(driver);
		}
		return selpg;
	}
	private Adactin_bookhotel bk;
	public Adactin_bookhotel get_Instance_bk()
	
	{
		if(bk==null)
		{
			bk=new Adactin_bookhotel(driver);
		}
		return bk;
	}
private Adactin_itinerary it;
public Adactin_itinerary get_Instance_it() {
	if(it==null)
	{
		it=new Adactin_itinerary(driver);
	}
	return it;
	
}
}
