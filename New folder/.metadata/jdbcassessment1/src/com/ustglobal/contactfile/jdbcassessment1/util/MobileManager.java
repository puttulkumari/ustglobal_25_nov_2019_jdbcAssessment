package com.ustglobal.contactfile.jdbcassessment1.util;

import com.ustglobal.contactfile.jdbcassessment1.dao.MobileDao;
import com.ustglobal.contactfile.jdbcassessment1.dao.MobileDaoImpl;

public class MobileManager {

	
	private MobileManager() {}

	public static MobileDaoImpl getMobileDAO() {
		return new MobileDaoImpl();
	}

	public static MobileDao getMobileDao() {
	
		return null;
	}
}
