package com.runnablepatterns.abstractfactorypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to handle CRC laptop creation 
 *
 */
public class LaptopStoreCRC extends LaptopStore {

	/**
	 * Default constructor to set the laptop name
	 */
	public LaptopStoreCRC() {
		setLaptopName("ASUS");
	}
	
	@Override
	protected Laptop createLaptop(LaptopTypeEnum laptopType) {
		// variable to store the laptop
		Laptop laptop = null;
		
		// variable to store the part factory implementation for CRC
		LaptopPartFactory partFactory = new LaptopPartFactoryCRC();
		
		// depending on the type
		switch (laptopType) {
		case SMALL:
			laptop = new SmallLaptop(this.getLaptopName(), partFactory);
			break;
		case MEDIUM:
			laptop = new MediumLaptop(this.getLaptopName(), partFactory);
			break;
		case BIG:
			laptop = new BigLaptop(this.getLaptopName(), partFactory);
			break;
		default:
			break;
		}
		
		// return the specific instance
		return laptop;
	}

}
