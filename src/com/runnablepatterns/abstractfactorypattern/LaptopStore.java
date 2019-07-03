package com.runnablepatterns.abstractfactorypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to handle laptop shipment and assembly processes
 * This class will be the standard for other factories
 *
 */
public abstract class LaptopStore {

	/**
	 * Variable to store the laptop name
	 */
	private String laptopName = "Default";
	
	/**
	 * Getter for laptopName property
	 * @return The laptop name value
	 */
	public String getLaptopName() {
		return this.laptopName;
	}
	
	/**
	 * Setter for laptopName property
	 * @param _laptopName The laptop name to set
	 */
	public void setLaptopName(String _laptopName) {
		this.laptopName = _laptopName;
	}
	
	/**
	 * Process the Laptop following the general standard
	 * @param laptopType The specific laptop to create
	 * @return The created Laptop instance
	 */
	public Laptop processLaptop(LaptopTypeEnum laptopType) {
		// stores the laptop instance
		Laptop laptop;
		
		// create the instance
		laptop = createLaptop(laptopType);
		
		// assembly the specific parts
		laptop.assemblyParts();
		
		// process the laptop
		review(laptop);
		installOS(laptop);
		pack(laptop);
		destination(laptop);
				
		// the laptop instance type
		return laptop;
	}
	
	/**
	 * This is the factory method that will handle Laptop creation
	 * @param laptopType The specific Laptop instance to create
	 * @return The Laptop instance
	 */
	protected abstract Laptop createLaptop(LaptopTypeEnum laptopType);
	
	/**
	 * Perform review process
	 * @param laptop The laptop to review
	 */
	public void review(Laptop laptop) {
		System.out.println(String.format("Reviewing the laptop: %s", laptop.getDescription()));
	}
	
	/**
	 * Perform OS installation
	 * @param laptop The laptop to install OS
	 */
	public void installOS(Laptop laptop) {
		System.out.println(String.format("Installing OS to the laptop: %s", laptop.getDescription()));
	}
	
	/**
	 * Package the laptop for shipping
	 * @param laptop The laptop to pack
	 */
	public void pack(Laptop laptop) {
		System.out.println(String.format("Packing the laptop: %s", laptop.getDescription()));
	}
	
	/**
	 * Add destination details to the laptop
	 * @param laptop The laptop to ship
	 */
	public void destination(Laptop laptop) {
		System.out.println(String.format("Adding destination details to the laptop: %s", laptop.getDescription()));
	}
}
