package javaoperators;

import java.util.Scanner;

// vowels and consonants

public class Ternaryoperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a charater:");
		char ch = sc.next().charAt(0);
		ch = Character.toUpperCase(ch);
		//write in lowerclass
		//ch = Character.toLowerCase(ch);
		//String result = (ch =='a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')?"vowel":"consonent";
		String result = (ch =='H'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')?"vowel":"consonent";
		System.out.println(result);
		sc.close();
		}

}
