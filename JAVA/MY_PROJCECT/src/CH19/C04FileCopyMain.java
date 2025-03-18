package CH19;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class C04FileCopyMain {	
	public static void main(String[] args) throws 
IOException
	{
		Reader fin = new FileReader("C:\\IoTest\\test3.txt");
		int data=0;
		
		String str="";
		StringBuffer buffer = new StringBuffer();
		
		char [] buf = new char[1024];	// 1024byte
		
		long startTime = System.currentTimeMillis();
		while((data = fin.read()) != -1) 
		{
//			buffer.append((char)data);
			buffer.append(buf);
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("소요시간 : " + (endTime-startTime) + "ms");
//		System.out.println(buffer);
		
		fin.close();
	}

}
