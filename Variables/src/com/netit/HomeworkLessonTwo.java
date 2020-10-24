package com.netit;

import java.util.Scanner;

public class HomeworkLessonTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("foumse person:");
		String name = in.nextLine();
		
		System.out.println("Is the person alive:(True/False)");
		boolean isAlive= in.nextBoolean();
		
		System.out.println(name+"is foumes person "+isAlive+" live ");
		

	}

}
