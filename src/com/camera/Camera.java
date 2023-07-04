package com.camera;
public class Camera {
	 private static int currentId = 10;
	private  int cameraId;
	private String brand;
	private String model;
	private double pricePerDay;
	private boolean status;
	public Camera() {
		// TODO Auto-generated constructor stub
		this.status=true;
		this.cameraId=Camera.currentId++;
	}
	public Camera( String brand, String model, double pricePerDay) {
		this.cameraId=Camera.currentId++;;
		this.brand = brand;
		this.model = model;
		this.pricePerDay = pricePerDay;
		this.status = true;
	}
	public int getCameraId() {
		return cameraId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	public String isStatus() {
		if(this.status) {
			return "Avaliable";
		}
		return "Rented";
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
