package com.src.streams.problems;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.code.common.User;

public class EmployeeGroupingByAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<User> usersList = Arrays.asList(
				new User(101, "Manojit Nandi", 39),
				new User(102, "Devdeep Nandi", 13),
				new User(103, "Rajkumar", 35),
				new User(104, "Raghavendra S", 42),
				new User(102, "Ahan Das", 13)
		);
		
	    Map<Integer, List<User>> mapUsers =	usersList.stream()
			.collect(Collectors.groupingBy(User::getAge));
	    
	    for(var e: mapUsers.entrySet()) {
	    	System.out.println("Age: " + e.getKey());
	    	for(User u : e.getValue()) {
	    		System.out.println("Id: " + u.getId() + " Name: " + u.getName() + " Age: " + u.getAge());
	    	}
	    }
	}

}
