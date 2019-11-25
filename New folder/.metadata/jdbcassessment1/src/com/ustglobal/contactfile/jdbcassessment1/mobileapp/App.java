package com.ustglobal.contactfile.jdbcassessment1.mobileapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.contactfile.jdbcassessment1.dao.MobileDao;
import com.ustglobal.contactfile.jdbcassessment1.dto.MobileBean;
import com.ustglobal.contactfile.jdbcassessment1.util.MobileManager;

public class App {
public static void main(String[] args) {
//	System.out.println("Press 1 to show all contacts");
//	System.out.println("Press 2 to search for contact(using name)");
//	System.out.println("Press 3 to operate on contact");
	
	
	
	
	System.out.println("Press 1 to get all mobile data");
	System.out.println("Press 2 to insert mobile data");
	System.out.println("Press 3 to update mbile data");
	System.out.println("Press 4 to delete mobile data");
	System.out.println("Press 5 to search single mobile data");

	Scanner scn = new Scanner(System.in);
	int ch = scn.nextInt();//reading integer to press 1,2,3 like that
	switch(ch) {
	case 1:
		
		MobileDao dao = MobileManager.getMobileDao();
		List<MobileBean> result = dao.getAllMobileData();

		for(MobileBean bean:result) {
			System.out.println("Num: "+bean.getNumber());
			System.out.println( "Name: "+bean.getName());
			System.out.println("Salary: "+bean.getGroups());
			

		}

		break;

	
	case 2:
		break;
	case 3:
		break;
	case 4:
		break;
	case 5:
		MobileDao dao5 = MobileManager.getMobileDao();
		System.out.print("Enter num: ");
		int id = scn.nextInt();
		MobileBean bean = dao5.searchMobileData(0);
		if(bean!=null) {
			System.out.println("Num: "+bean.getNum());
			System.out.println( "Name: "+bean.getName());
			System.out.println("Salary: "+bean.getGroups());
			

		}else {
			System.out.println("No data found");
		}
		break;
	default:
		System.out.println("Wrong Entry plz press between 1-9");

	}
}
}




