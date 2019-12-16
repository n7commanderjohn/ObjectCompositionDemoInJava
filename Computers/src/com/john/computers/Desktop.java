package com.john.computers;

public class Desktop extends Computer {
	
//	public Desktop() {
//		super();
//	}
	
	@Override
	public String toString() {
		return String.format("Desktop \n[\n\tram=`%s`, os=`%s`, \n\tprocessor=`%s`, \n\tgpu=`%s`\n]", 
				ram, os, processor, gpu);
	}

	
}
