package com.src.lesson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.code.common.User;

public class UsersSortAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> usersList = Arrays.asList(
				new User(101, "Manojit Nandi", 39),
				new User(102, "Devdeep Nandi", 13),
				new User(103, "Rajkumar", 35),
				new User(104, "Raghavendra S", 42)
		);
		
		List<User> sortedList = usersList.stream()
										//.sorted((o1, o2) -> o1.getAge() - o2.getAge())
										.sorted(Comparator.comparingInt(User::getAge).reversed())
										.toList();
		
		for(var e : sortedList) {
			System.out.println("Id: " + e.getId() + " Name: " + e.getName() + " Age: " + e.getAge());
		}
	}

}
