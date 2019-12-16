package com.john.computers;

public class Processor {
	private int cores; //fields
	private double speed;
	private String name;
	private int reliability;

	public Processor() {
		this.speed = 4.02;
		this.cores = 8;
		this.name = "Intel";
		this.reliability = 5;
	}

	public Processor(int cores, double speed, String name, int realibiilty) {
		this.cores = cores;
		this.speed = speed;
		this.name = name;
		this.reliability = realibiilty;
	}

	public int getCores() {
		return cores;
	}

	public void setCores(int cores) {
		this.cores = cores;
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

	public int getReliability() {
		return reliability;
	}

	public void setReliability(int reliability) {
		this.reliability = reliability;
	}

	@Override
	public String toString() {
		return String.format("Processor [cores= `%s`, speed= `%s`, name= `%s`]", cores, speed, name);
	}

}
