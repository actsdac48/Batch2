package consoleInput;

public class GetInput {
	public static String getString() {

		try {

			byte arr[] = new byte[50];
			int length = System.in.read(arr);
			byte[] arrFinal = new byte[length - 2];
			System.arraycopy(arr, 0, arrFinal, 0, length - 2);
			String res = new String(arrFinal);
			return res;
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}
	}

	public static int getInt() {
		return Integer.parseInt(getString());
	}

	public static boolean getBoolean() {
		return Boolean.parseBoolean(getString());
	}
	
	public static Double getDouble() {
		return Double.parseDouble(getString());
	}
	
	public static Float getFloat() {
		return Float.parseFloat(getString());
	}
}
