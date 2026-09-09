package com.src.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.code.common.User;

public class EmployeeGroupingAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> usersList = Arrays.asList(
				new User(101, "Manojit Nandi", 39),
				new User(102, "Devdeep Nandi", 13),
				new User(103, "Rajkumar", 35),
				new User(104, "Raghavendra S", 42),
				new User(102, "Ahan Das", 13)
		);
		
		Map<Integer, List<User>> mapData = usersList.stream()
												    .collect(Collectors.groupingBy(User::getAge));
		
		for(var e : mapData.entrySet()) {
			System.out.println(e.getKey());
			for(var e1 : e.getValue()) {
				System.out.println("Name: " + e1.getName());
			}
		}
	}

}
