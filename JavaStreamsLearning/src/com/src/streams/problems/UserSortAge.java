package com.src.streams.problems;
import com.code.common.User;
import java.util.List;
import java.util.Arrays;

public class UserSortAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> usersList = Arrays.asList(
				new User(101, "Manojit Nandi", 39),
				new User(102, "Devdeep Nandi", 13),
				new User(103, "Rajkumar", 35),
				new User(104, "Raghavendra S", 42)
		);
		
		List<User> usersSortedList = usersList.stream()
											  .sorted((o1, o2) -> o1.getAge() - o2.getAge())
											  .toList();
		
		for(User u : usersSortedList) {
			System.out.println("Id: " + u.getId() + " Name: " + u.getName() + " Age: " + u.getAge());
		}
	}

}
