package com.john.computers;

public class GPU {
	private int memory;
	private double speed;
	private String name;
	
	public GPU() {
		this.memory = 3072;
		this.speed = 4.05;
		this.name = "Nvidia";
	}

	public GPU(int memory, double speed, String name) {
		this.memory = memory;
		this.speed = speed;
		this.name = name;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("GPU [memory=`%s`, speed=`%s`, name=`%s`]",
				memory, speed, name);
	}

	
}
