package com.runnablepatterns.abstractfactorypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Laptop Part Factory class to encapsulate part assembly process
 *
 */
public interface LaptopPartFactory {

	/**
	 * Handles the HardDrive assembly process
	 * @return The HardDrive
	 */
	public HardDrive assemblyHardDrive();
	
	/**
	 * Handles the RAM assembly process
	 * @return The RAM
	 */
	public RAM assemblyRAM();
	
	/**
	 * Handles the VideoCard assembly process
	 * @return The VideoCard
	 */
	public VideoCard assemblyVideoCard();
}
