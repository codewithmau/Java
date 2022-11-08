package com.properties.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DemoProperties {
	
   public static void main(String[] args) throws IOException {
	

	FileInputStream fis = new FileInputStream("D:\\simple.properties");
    Properties properties = new Properties();
    properties.load(fis);
    String uname = properties.getProperty("username");
    String pwd = properties.getProperty("password");
    
    System.out.println("Username :" + uname);
    System.out.println("Password :" + pwd);
   
   }
}