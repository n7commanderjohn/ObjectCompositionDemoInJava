package com.john.computers;
/**
 * 1. Desktop<br>
 * 2. Laptop<br>
 * 3. Mobile Phone<br>
 * 
 * @author John-PCD
 */
public class Computer {

	int ram;
	String os;
	Processor processor;
	GPU gpu;
	
	public Computer() {
		this.ram = 8192;
		this.os = "Windows";
		this.processor = new Processor();
		this.gpu = new GPU();
	}
	
	public Computer(int ram, String os, Processor processor, GPU gpu) {
		this.ram = ram;
		this.os = os;
		this.processor = processor;
		this.gpu = gpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public GPU getGpu() {
		return gpu;
	}

	public void setGpu(GPU gpu) {
		this.gpu = gpu;
	}

	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", os=" + os + ", "
			+ "processor=" + processor + ", gpu=" + gpu + "]";
	}
	
}
