package com.src.streams.problems;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "my experiment with         truth";
		String[] strArray = str.split("\\s+");
		Stream<String> streamData = Stream.of(strArray);
		String reversedWordString = streamData.map(word -> new StringBuilder(word).reverse().toString())
			.collect(Collectors.joining(" "));
		System.out.println(reversedWordString);
	}

}
