package com.example.webapp.utility;

import org.springframework.core.SpringVersion;
import org.springframework.security.core.SpringSecurityCoreVersion;

public class SpriengVersionCheck {
	public static void main(String[] args) {
		//SpringFrameworkのバージョン
		String springVersion = SpringVersion.getVersion();
		System.out.println("Spring Frameworkのバージョン:" + springVersion);
		
		//SpringBootのバージョン
		String bootVersion = SpringVersion.getVersion();
		System.out.println("Spring Bootのバージョン:" + bootVersion);
		
		//SpringSecurityのバージョン
		String securityVersion = SpringSecurityCoreVersion.getVersion();
		System.out.println("Spring Securityのバージョン:" + securityVersion);
	}
}
