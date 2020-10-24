package com.netit;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("name:");
		String name = in.next();
		
		System.out.print("Age:");
		byte age = in.nextByte();
		
		System.out.print("Salary:");
		double salary = in.nextFloat();
	
		System.out.print(name+" has "+salary+" per month like sinior java developer");

	}

}
