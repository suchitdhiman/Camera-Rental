package com.camera;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class User {
	   public Scanner sc=new Scanner(System.in);
	 private String username;
	    private String password;
	    Camera camera;
	    ArrayList<Camera> camList= new ArrayList<Camera>();
	    private   Wallet wallet;
	    public User(String username, String password ) {
	    	wallet=new Wallet();
	        this.username = username;
	        this.setPassword(password);
	    }

	    public String getUsername() {
	        return username;
	    }

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	
		 public void addCamera() {
				Camera  newCamera=new Camera();
				System.out.print("Enter the camera Brand :- ");
				newCamera.setBrand(sc.next());
				System.out.print("Enter the model :- ");
				newCamera.setModel(sc.next());
				System.out.println("Enter the per day price (Inr) :- ");
				newCamera.setPricePerDay(sc.nextDouble());
				if(ManageCamera.allCamera.add(newCamera)) {
					System.out.println("YOUR CAMERA HAS BEEN SUCCESSFULLY ADDED TO THE LIST");
				}
				else {
					System.out.println("Please try again........");
				}
			}
		  public void remove() {
			  System.out.println("ENTER THE CAMERA ID TO REMOVE :- ");
			  int delId=sc.nextInt();
			  int flag=0;
			  Iterator<Camera> iterator = ManageCamera.allCamera.iterator();
			  while (iterator.hasNext()) {
			        Camera cam = iterator.next();
			        if (cam.getCameraId() == delId) {
			        	if(cam.isStatus()=="Rented") {
			        		System.out.println("THIS ACTION CANNOT BE COMPLETED BECAUSE THE CAMERA YOU WANT "
			        				+ "TO DELETE IS CURRENTLY RENT BY CUTOMER ");
			        	}
			        	else {
			            iterator.remove(); // Safely remove the camera from the list
			            flag = 1;
			            System.out.println("CAMERA SUCCESSFULLY DELETED FROM THE LIST.");
			        	}
			        }
			    }
			    if (flag == 0)
			        System.out.println("ENTER CORRECT CAMERA ID .....");
		  }
		  
		  public void viewMyCamera() {
			  System.out.println("=============================================================================");
			  System.out.println("CAMERA iD		"+"BRAND		"+"PRICE PER DAY		"+"STATUS");
			  System.out.println("=============================================================================");
			  for(Camera cam: camList) {
				  System.out.print(cam.getCameraId()+"		"+cam.getBrand()+"		"+cam.getPricePerDay()+"		"+cam.isStatus());
			 System.out.println();
			  }
		  }
		  public void getAllCamers() {
			 ArrayList<Camera> allCam= ManageCamera.getAllCamera();
			 System.out.println("=============================================================================");
			  System.out.println("CAMERA iD		"+"BRAND		"+"PRICE PER DAY		"+"STATUS");
			  System.out.println("=============================================================================");
			  for(Camera cam: allCam) {
				  System.out.print(cam.getCameraId()+"			"+cam.getBrand()+"	"
				  		+ "	"+cam.getPricePerDay()+"		"+cam.isStatus());
			 System.out.println();
			  }
		  }
		  public  void RentCamera() {
			  System.out.println("ENTER THE CAMERA ID YOU WANT TO RENT -");
			  int rentId=sc.nextInt();
			  Camera cm=findCameraByID(rentId);
			  if(!cm.equals(null)) {
			  if(wallet.getCurrentWallet()>= cm.getPricePerDay() ) {
				  cm.setStatus(false);
				  camList.add(cm);
				  System.out.println("YOUR TRANSACTION FOR CAMERA "+cm.getBrand()+" "+cm.getModel()+" "
						+"with "+cm.getPricePerDay()+" "+"HAS SUCCESSFULLY COMPLETED "  );
			  }
			  else {
				  System.out.println("TRANSACTION FAILED DUE TO INSUFFICIENT BALANCE"
				  		+". PLEASE FIRST DEPOSITE THE AMOUT TO YOUR WALLET");
			  }
			  }
		  }
		  public void myWallet() {
			  System.out.println("YOUR CURRENT WALLET BALANCE IS - INR."+wallet.getCurrentWallet());
			 System.out.println("DO YOU WANT TO MAKE DEPOSITE IN YOUR ACCOUNT ?(1.YES 2.NO)-");
			 int choice=sc.nextInt();
			 if(choice==1) {
				 System.out.println("ENTER THE AMOUNT (INR) - ");
				 wallet.deposite(sc.nextDouble());
			 }
			 else {
				 System.out.println("THANK YOU FOR CHOOSING US....");
			 }
		  }
		  public Camera findCameraByID(int id) {
			  ArrayList<Camera> allCam= ManageCamera.getAllCamera();
			  for(Camera cam:allCam) {
				  if(cam.getCameraId()==id)
					  return cam;
			  }
			  return null;
		  }
		  public static void UserOption() {
			  System.out.println("1. RENT A CAMERA");
			  System.out.println("2. VIEW MY CAMERA");
			  System.out.println("3. GO TO PREVIOUS MENU ");
			 ManageUser.runUserOption();
		  }
	}
