package day5;

public interface RegularPolygon {
	
	
	
	public int getSideLength();
	public int getNumSides();
	
	default float getPerimeter() {
		return getNumSides()*getSideLength();
	}
	
	default double getInteriorAngle() {
		return (getNumSides()-2)*Math.PI/getNumSides();
	}
	
	static int totalSides(RegularPolygon[] polygons) {
		int total = 0;
		
		for(RegularPolygon polygons1 : polygons) {
			total += polygons1.getNumSides();
		}
		
		return total;
	}
}
