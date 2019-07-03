package com.runnablepatterns.abstractfactorydemo;

import com.runnablepatterns.abstractfactorypattern.LaptopStore;
import com.runnablepatterns.abstractfactorypattern.LaptopStoreCRC;
import com.runnablepatterns.abstractfactorypattern.LaptopStoreUSA;
import com.runnablepatterns.abstractfactorypattern.LaptopTypeEnum;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// create specific store
		LaptopStore crcStore = new LaptopStoreCRC();
		
		System.out.println("Processing laptop in CRC started \n");

		// process the specific Laptop
		crcStore.processLaptop(LaptopTypeEnum.MEDIUM);
		
		// create specific store
		LaptopStore usaStore = new LaptopStoreUSA();
		
		System.out.println("\nProcessing laptop in USA started \n");
		// process the specific Laptop
		usaStore.processLaptop(LaptopTypeEnum.MEDIUM);
		
	}

}
