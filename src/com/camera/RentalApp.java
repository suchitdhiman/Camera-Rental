package com.camera;

import java.util.Scanner;

public class RentalApp {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("*-----------------------------------*");
		System.out.println("| WELCOME TO THE CAMERA RENTAL APP  |");
		System.out.println("*-----------------------------------*");
		System.out.println("PLEASE LOG IN TO CONTINUE -");
		System.out.println("USERNAME -");
		String id=sc.next();
		System.out.println("PASSWORD -");
		String pas=sc.next();
		ManageUser mu=new  ManageUser();
		mu.VerifyUser(id, pas);
	}
}
