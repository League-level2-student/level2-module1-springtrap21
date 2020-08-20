package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> karma = new ArrayList<String>();
		//2. Add five Strings to your list
		karma.add("oof");
		karma.add("oops");
		karma.add("hobo");
		karma.add("hipi");
		karma.add("bozo");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < karma.size(); i++) {
			System.out.println(karma.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for (String word : karma) {
			System.out.println(word);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 1; i < karma.size(); i = i + 2) {
			System.out.println(karma.get(i));
		}
		//6. Print all the Strings in reverse order.
		for (int i = karma.size()-1; i >= 0; i--) {
			System.out.println(karma.get(i));
		}
		//7. Print only the Strings that have the letter 'o' in them.
		for (String hello : karma) {
			if (hello.indexOf('o') != -1) {
				System.out.println(hello);
			}
		}
	}
}
