package chapter5;

import java.util.Scanner;

public class TestEnum {
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARCE) ");
		String input = in.next().toUpperCase();
		EnumExample ee =  Enum.valueOf(EnumExample.class, input);
		System.out.println("EnumExample ee::"+ee);
		String getEE = ee.getAbbreviation();
		System.out.println("getEE::"+getEE);
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
