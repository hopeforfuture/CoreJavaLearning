package com.src.datetime;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class AgeFinderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter date of birth: ");
			String dobStr = sc.next();
			LocalDate dob = LocalDate.parse(dobStr);
			LocalDate currentDate = LocalDate.now();
			Period age = Period.between(dob, currentDate);
			System.out.println("Age: " + age.getYears() + " years " + age.getMonths() + 
					" Months " + age.getDays() + " Days");
		}
	}

}
