package org.hrms.driver;

import org.hrms.admin.AdminDepartment;

public class Main {

	public static void main(String[] args) {
		AdminDepartment admin = new AdminDepartment();
		String departmentName;
		
		departmentName=admin.departmentName();
		System.out.println(departmentName);
		admin.getTodaysWork();
	}

}
