package com.property.reader;

import java.io.IOException;

public class Adactin_Filereader_Manager {
	public Adactin_Configuration_Reader get_Instance_ACR() throws IOException
	{
		Adactin_Configuration_Reader reader=new Adactin_Configuration_Reader();
		return reader;
	}
	public  static Adactin_Filereader_Manager get_Instance_AFRM()
	{
	Adactin_Filereader_Manager afrm=new Adactin_Filereader_Manager();
	return afrm;
	}
	private Adactin_Filereader_Manager()
	{
		
	}

}
