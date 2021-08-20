package week2.Day2;

import java.lang.*;
import java.util.*;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		
		
		String text = "Tes12Le79af65"; 
		int method1sum=0, method2sum=0;
		
		//Method#1
		String text1=text.replaceAll("\\D", "");
		char[] text1Array = text1.toCharArray();
		
		System.out.println("Given String : "+text);
		System.out.println("STring after non digits removal : "+text1);
		for(int i=0;i<text1Array.length;i++) {
			int numericValue = Character.getNumericValue(text1Array[i]);
			method1sum=method1sum+numericValue;
			System.out.println("Char converted to num : "+numericValue);
		}
			System.out.println("Sum of Digits from Given String : "+method1sum);
			
	    //Method#2
		for(int i=0;i<text.length();i++) {
			char char1=text.charAt(i);
			if(Character.isDigit(char1))
				method2sum=method2sum+Character.getNumericValue(char1);							
		}
		System.out.println("Sum of Digits in the given String : "+method2sum);	
	}

}
