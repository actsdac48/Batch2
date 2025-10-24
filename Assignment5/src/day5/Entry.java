package day5;



public class Entry {

	public static void main(String[] args) {
		
		
		EquilateralTriangle triangle = new EquilateralTriangle(3);
		Square square = new Square(4);
		
		
		
		
		RegularPolygon [] polygons = {triangle, square};  
		
		int total = RegularPolygon.totalSides(polygons);
        System.out.println("\nTotal number of sides of all polygons: " + total);
        System.out.println(triangle.getNumSides());
        System.out.println(square.getNumSides());
        

	}

	

}
