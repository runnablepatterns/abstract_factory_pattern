package com.runnablepatterns.abstractfactorypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Laptop Part Factory implementation for USA parts
 *
 */
public class LaptopPartFactoryUSA implements LaptopPartFactory {

	@Override
	public HardDrive assemblyHardDrive() {
		return new HardDriveUSA();
	}

	@Override
	public RAM assemblyRAM() {
		return new RAMUSA();
	}

	@Override
	public VideoCard assemblyVideoCard() {
		return new VideoCardUSA();
	}

}
