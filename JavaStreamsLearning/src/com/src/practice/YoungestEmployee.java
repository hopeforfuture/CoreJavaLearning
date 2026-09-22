package com.src.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.code.common.User;

public class YoungestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> users = Arrays.asList(
					new  User(101, "Deep", 25),
					new  User(102, "Raju", 35),
					new  User(103, "Tapas", 43),
					new  User(104, "Arpan", 22)
				);
		
		User u=  users.stream()
					        .collect(Collectors.collectingAndThen(
							
								Collectors.minBy(Comparator.comparingInt(User::getAge)),
								user -> user.get()
							
							));
		
		System.out.println(u.getName() + " : " + u.getAge());
	}

}
