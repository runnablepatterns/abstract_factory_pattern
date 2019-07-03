package com.runnablepatterns.abstractfactorypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Big Laptop class to hold specific laptop details
 *
 */
public class BigLaptop extends Laptop {

	/**
	 * Variable to store the Part Factory implementation
	 */
	private LaptopPartFactory partFactory;
	
	/**
	 * Overloaded constructor
	 * @param _name Laptop name value
	 * @param _partFactory Part Factory implementation
	 */
	public BigLaptop(String _name, LaptopPartFactory _partFactory) {
		super(_name);
		this.partFactory = _partFactory;
	}

	/**
	 * Get specific details
	 */
	public String getDescription() {
		System.out.println(String.format("[Log] getting big laptop description for: %s Laptop", this.getName()));
		return String.format("%s: Base Big Laptop", this.getName());
	}
	
	@Override
	public void assemblyParts() {
		System.out.println(String.format("[Log] starting part assembly for Big Laptop: %s", this.getName()));
		System.out.println(this.partFactory.assemblyHardDrive().getDescription());
		System.out.println(this.partFactory.assemblyRAM().getDescription());
		System.out.println(this.partFactory.assemblyVideoCard().getDescription());
	}

}
