package com.camera;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageUser {
	public static Scanner sc=new Scanner(System.in);
	ArrayList<User> users= new ArrayList<>(); 
	public static User Currentuser; 
	User shashant=new User("shashant","123");
	User suchit=new User("suchit","456");
public ManageUser() {
	users.add(shashant);
	users.add(suchit);
}
public void VerifyUser(String userName,String password) {
	int flag=0;
	for(User u:users) {
	if(u.getUsername().equals(userName) && u.getPassword().equals(password)) {
	flag=1;
	ManageUser.Currentuser =u;
	SelectOptionMainMenu();
	}
	}
	if(flag==0)
		System.out.println("INVALID USERNAME OR PASSWORD.........");
}
	public static void SelectOptionMainMenu() {
		System.out.println("1. MY CAMERA ");
		System.out.println("2. ADD");
		System.out.println("3. Remove");
		System.out.println("4. VIEW ALL CAMERAS ");
		System.out.println("5. MY WALLET ");
		System.out.println("6. EXIT ");
		run();
	}
	   public static void run() {
	        boolean exit = false;
	        int option;
	        while (!exit) {
	            option = sc.nextInt();
	            sc.nextLine(); // Consume the new line character

	            switch (option) {
	                case 1:
	                  User.UserOption();
	                    break;
	                case 2:
	                    Currentuser.addCamera();;
	                    SelectOptionMainMenu();
	                    break;
	                case 3:
	                	Currentuser.remove();
	                    SelectOptionMainMenu();
	                	break;
	                case 4:
	                	Currentuser.getAllCamers();;
	                	  SelectOptionMainMenu();
	                	break;
	                case 5:
	                   Currentuser.myWallet();
	                   SelectOptionMainMenu();
	                    break;
	                case 6:
	                    exit = true;
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	                    break;
	            }
	        }
	    }
	   public  static void  runUserOption() {
			  boolean flag=true;
			  while(flag) {
				  int temp=sc.nextInt();
				  switch(temp) {
				  case 1:
				Currentuser.RentCamera();
				User.UserOption();
				  break;
				  case 2:
				  Currentuser.viewMyCamera();
				  User.UserOption();
				  break;
				  case 3 :
             	  ManageUser.SelectOptionMainMenu();
             	  break;
				   default:
	                    System.out.println("Invalid option. Please try again.");
	                    break;
				  } 
			  }
		  }
}
