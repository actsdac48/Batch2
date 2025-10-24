package day8.four;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import consoleInput.GetInput;

public class EncryptDecrypt {
	
	
	static void encryption(File file) {
		try(FileOutputStream ObjFile = new FileOutputStream(file)){
			
			System.out.println("Enter The data");
			String data= GetInput.getString();
			byte[] arrData = data.getBytes();
			
			for(int i=0; i<arrData.length; i++) {
				arrData[i]=(byte) (arrData[i]+21);
			}
			
			ObjFile.write(arrData);
			
			System.out.println("File saved");
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
		} catch (IOException e) {
			
			System.out.println(e);
		}
	}
	
	static void decryption(File ObjFile) {
		try(FileInputStream fileStream = new FileInputStream(ObjFile);){
			
			byte[] data = new byte[(int)ObjFile.length()];

			
			fileStream.read(data);
			
			for(int i=0; i<data.length; i++) {
				data[i]=(byte) (data[i]-21);
			}

			
			System.out.println(new String(data));
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
		} catch (IOException e) {
			
			System.out.println(e);
		}
	}
	
	
	
	

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\dac\\Desktop\\BATCH2\\Test.txt");
	
		
		
		encryption(file);
		
		
		
		//decryption(file);
		


	}

}
