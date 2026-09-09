package com.src.code;

public class DeleteSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Java is powerful");
		for(int i=sb.length()-1; i>=0; i--) {
			if(sb.charAt(i) == ' ') {
				sb.deleteCharAt(i);
			}
		}
		
		System.out.println(sb);
	}

}
