package com.test;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("my first program in laptop");
		
		
		String str= "/content/dam/we-retail/en/activities/hiking/hiking_5.jpg";
		//replace str with xssAPI.encodeForHTML(resource.getPath())
		if(null!= str && str.startsWith("/content/dam/")) {
			int n=3;
			int position= str.indexOf("/");
			while (--n > 0 && position != -1) {
				position = str.indexOf("/", position + 1);
			}
			System.out.println(str.substring(position, str.lastIndexOf("/")));
			
		}
		

	}

}
