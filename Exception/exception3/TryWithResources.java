package com.yash.exception3;

import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter B Value");
		int b = sc.nextInt();
		try {
			System.out.println("Try Start");

			int a = b / 0;

			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Catch Block");
		} finally {
			System.out.println("Finally Block");
		}

	}

}
