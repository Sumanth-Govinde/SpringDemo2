package com.slk.training.beans;

public class Car {
	private String model;
	private double cost;
	private Engine engine;
	
	
	public Car(String model, double cost, Engine engine) {
		super();
		this.model = model;
		this.cost = cost;
		this.engine = engine;
	}
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", cost=" + cost + ", engine=" + engine + "]";
	}
	
	public void started1()
	{
		System.out.println("Car started");
		engine.process();
	}

}
