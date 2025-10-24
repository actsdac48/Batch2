package day5;

public class EquilateralTriangle implements RegularPolygon {

	
	int sideLength;
	public EquilateralTriangle(int sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public int getSideLength() {
		return sideLength;
		
	}

	@Override
	public int getNumSides() {
		return 3;		
	}
	
	

}
