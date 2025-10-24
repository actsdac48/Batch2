package day5;

public class Square implements RegularPolygon{

	
	int sideLength;
	public Square(int sideLength) {
		this.sideLength = sideLength;
	}
	
	@Override
	public int getSideLength() {
		return sideLength;
	}

	
	@Override
	public int getNumSides() {
		return 4;
	}

}
