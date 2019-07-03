package com.runnablepatterns.abstractfactorypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Hard Drive class to be added to a laptop
 *
 */
public abstract class HardDrive {
	
	/**
	 * Get the specific HardDrive description value
	 * @return The description value
	 */
	public abstract String getDescription();/* {
		// get the inner description plus current one
		System.out.println("[Log] getting inner description and Hard Drive description");
		return laptop.getDescription() + ", Hard Drive added";		
	}*/

}