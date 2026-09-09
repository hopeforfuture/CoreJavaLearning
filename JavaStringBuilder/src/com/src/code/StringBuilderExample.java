package com.src.code;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		//append
		sb.append(" World");
		System.out.println(sb);
		//insert
		sb.insert(6, "Java ");
		System.out.println(sb.toString());
		//delete
		sb.delete(6, 10);
		System.out.println(sb.toString());
		//replace
		sb.replace(0, 5, "Hi");
		System.out.println(sb);
		//set character
		sb.setCharAt(0, 'K');
		System.out.println(sb);
		//reverse
		sb.reverse();
		System.out.println(sb);
		//Length
		System.out.println("Length: " + sb.length());
		//Capacity
		System.out.println("Capacity: " + sb.capacity());
		//Convert string
		String str = sb.reverse().toString();
		System.out.println(str);
	}

}
