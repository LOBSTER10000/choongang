package chap10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithEx {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("c:/Temp/file1.txt")) {
			int data;
			while((data = fis.read()) != -1) {
				System.out.println(data);
			} 
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}