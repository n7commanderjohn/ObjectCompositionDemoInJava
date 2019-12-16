/**
 * 
 */
package com.john.running;

import com.john.computers.*;

/**
 * @author John-PCD
 *
 */
public class MakeComputers {

	public static void main(String[] args) {
		Processor p = new Processor(3, 4.05, "ATI", 3);
		GPU gpu = new GPU(2048, 2.05, "Nvidia"); //int memory, double speed, String name
		
		Computer c = new Computer(4096, "Windows 10", p, gpu);
		
		System.out.println(c.toString());
	}

}
