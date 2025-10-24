package day8.one;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import consoleInput.GetInput;

public class TryWithResources {

	public static void main(String[] args) {
		
		try(FileOutputStream ObjFile = new FileOutputStream("C:\\Users\\dac\\Desktop\\BATCH2\\Test.txt");){
			
			System.out.println("Enter The data");
			String data= GetInput.getString();
			
			byte[] arrData = data.getBytes();
			
			ObjFile.write(arrData);
			
			System.out.println("File saved");
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
		} catch (IOException e) {
			
			System.out.println(e);
		}

	}

}
