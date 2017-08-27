package com.createfolder;

import java.time.LocalDateTime;
import java.util.*;

public class CreateFolderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World"); 
		System.out.println(""+Calendar.DAY_OF_YEAR);
		LocalDateTime timeDate = LocalDateTime.now();
		System.out.println(timeDate.getYear()+"-"+timeDate.getMonth()+"-"+timeDate.getDayOfMonth());
		
		Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH);
        
        System.out.println(year+"-"+month+"-"+day);
		
	}

}
