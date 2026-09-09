package com.src.code;

public class StringReplaceDemo {
	
	public static void replace(StringBuilder sb, String oldString, String newString) {
		int index = 0;
		while(( index = sb.indexOf(oldString)) != -1) {
			sb.replace(index, index + oldString.length(), newString);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Java is awesome. Modern Java is really powerful.");
		replace(sb, "Java", "Python");
		System.out.println(sb);
	}

}
