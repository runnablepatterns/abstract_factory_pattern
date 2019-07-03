package com.runnablepatterns.abstractfactorypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Small Laptop class to hold specific laptop details
 *
 */
public class SmallLaptop extends Laptop {

	/**
	 * Variable to store the Part Factory implementation
	 */
	private LaptopPartFactory partFactory;
	
	/**
	 * Overloaded constructor
	 * @param _name Laptop name value
	 * @param _partFactory Part Factory implementation
	 */
	public SmallLaptop(String _name, LaptopPartFactory _partFactory) {
		super(_name);
		this.partFactory = _partFactory;
	}

	/**
	 * Get specific details
	 */
	public String getDescription() {
		System.out.println(String.format("[Log] getting small laptop description for: %s Laptop", this.getName()));
		return String.format("%s: Base Small Laptop", this.getName());
	}
	
	@Override
	public void assemblyParts() {
		System.out.println(String.format("[Log] starting part assembly for Small Laptop: %s", this.getName()));
		System.out.println(this.partFactory.assemblyHardDrive().getDescription());
		System.out.println(this.partFactory.assemblyRAM().getDescription());
		System.out.println(this.partFactory.assemblyVideoCard().getDescription());
	}

}
