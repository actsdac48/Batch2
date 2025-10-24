package day7.exception;

public class ExploreExp {
	public static void main(String [] args) {
		
		try {
		    int x = 10 / 0;
		} catch (ArithmeticException e) {
		    System.out.println("ArithmeticException");
		}

		int[] arr = {1, 2, 3};
		try {
		    
		    System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("ArrayIndexOutOfBoundsException");
		}finally {
			try {
				System.out.println(arr[4]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException");
			}finally {
				try {
					System.out.println(arr[3]);
				}catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("ArrayIndexOutOfBoundsException");
				}finally {
					try {
						System.out.println(arr[2]);
					}catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("ArrayIndexOutOfBoundsException");
					}
				}
			}
			System.out.println("Exception Handled");
		}

		
		try {
		    String str = null;
		    System.out.println(str.length());
		} catch (NullPointerException e) {
		    System.out.println("NullPointerException");
		}finally {
			System.out.println("Exception Handled");
		}

		
		try {
		    int n = Integer.parseInt("abc");
		} catch (NumberFormatException e) {
		    System.out.println("NumberFormatException");
		}finally {
			System.out.println("Exception Handled");
		}

		
		try {
		    java.io.FileReader fr = new java.io.FileReader("nofile.txt");
		} catch (java.io.FileNotFoundException e) {
		    System.out.println("FileNotFoundException");
		}finally {
			System.out.println("Exception Handled");
		}

		
		try {
		    java.io.FileReader fr = new java.io.FileReader("nofile.txt");
		    fr.read();
		} catch (java.io.IOException e) {
		    System.out.println("IOException");
		}finally {
			System.out.println("Exception Handled");
		}

		
		try {
		    Class.forName("com.example.UnknownClass");
		} catch (ClassNotFoundException e) {
		    System.out.println("ClassNotFoundException");
		}finally {
			System.out.println("Exception Handled");
		}

		
		try {
		    Thread.sleep(-100);
		} catch (IllegalArgumentException e) {
		    System.out.println("IllegalArgumentException");
		} catch (InterruptedException e) {
		    System.out.println("InterruptedException");
		}finally {
			System.out.println("Exception Handled");
		}

		
		try {
		    String s = "abc";
		    System.out.println(s.charAt(5));
		} catch (StringIndexOutOfBoundsException e) {
		    System.out.println("StringIndexOutOfBoundsException");
		}finally {
			System.out.println("Exception Handled");
		}

	}
}
