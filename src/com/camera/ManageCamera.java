package com.camera;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageCamera {
	Scanner sc=new Scanner(System.in);
	public static ArrayList<Camera> allCamera=new ArrayList<>();
	static {
		allCamera.add(new Camera("apple","apple",200.0));
		allCamera.add(new Camera("sony","apple",200.0));
		allCamera.add(new Camera("nokia","apple",200.0));
		allCamera.add(new Camera("iphone","apple",200.0));
		allCamera.add(new Camera("redmi","apple",200.0));
		allCamera.add(new Camera("vivo","apple",200.0));
		allCamera.add(new Camera("mi","apple",200.0));
		allCamera.add(new Camera("philips","apple",200.0));
		allCamera.add(new Camera("ZBL","ZBL",200.0));
	}
	public static ArrayList<Camera> getAllCamera(){
		return allCamera;
	}
}
