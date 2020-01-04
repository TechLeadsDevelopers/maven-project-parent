package com.maven.parent.app;

public class ParentApp {
	
	private static Class<?> clasName;

	public static void loadMySQLDriver() {
		try {
			clasName = Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(clasName+" loaded ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
