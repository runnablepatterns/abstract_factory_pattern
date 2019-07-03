package com.runnablepatterns.abstractfactorypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Laptop abstract class to hold laptop details 
 *
 */
public abstract class Laptop {
	
	/**
	 * Variable to store the description details
	 */
	private String description = "No details available.";
	
	/**
	 * Variable to store the name details
	 */
	private String name = "Default";
	
	/**
	 * Overloaded constructor
	 * @param _name Laptop name
	 */
	public Laptop(String _name) {
		this.name = _name;
	}
	
	/**
	 * User default constructor
	 */
	public Laptop() {
	}

	/**
	 * Get the description details
	 * @return Laptop description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Get the name details
	 * @return Laptop name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Assembly all Laptop parts
	 * 
	 */
	public abstract void assemblyParts();
}
