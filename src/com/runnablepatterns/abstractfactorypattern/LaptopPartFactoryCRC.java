package com.runnablepatterns.abstractfactorypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Laptop Part Factory implementation for Costa Rica parts
 *
 */
public class LaptopPartFactoryCRC implements LaptopPartFactory {

	@Override
	public HardDrive assemblyHardDrive() {
		return new HardDriveCRC();
	}

	@Override
	public RAM assemblyRAM() {
		return new RAMCRC();
	}

	@Override
	public VideoCard assemblyVideoCard() {
		return new VideoCardCRC();
	}

}
