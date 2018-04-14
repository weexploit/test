package tt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test2 {
	public static void main(String[] args) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		FileReader reader=null; 
		try {
			reader=new FileReader("D:/a1.txt");
			char c=(char)reader.read();
			char c1=(char)reader.read();
			System.out.println(""+c+"\n"+c1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(reader!=null)
				{
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
