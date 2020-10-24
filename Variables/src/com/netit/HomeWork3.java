package com.netit;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Name:");
		String student = in.nextLine();
		
		System.out.println("Which class:");
		byte levelOfEducation = in.nextByte();
		
		System.out.println("Please write");
		float avaregeScore = in.nextFloat();
		
		System.out.println(student+" is gradueated in "+levelOfEducation+" class with avarage score "+avaregeScore);

	}

}
