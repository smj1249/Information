package Ch19;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class C04FileCopyMain {


	public static void main(String[] args) throws IOException	//args[0] 원본파일 args[1] 대상파일
	{
		Reader fin = new FileReader("C:\\IOTEST\\test3.txt");
		int data=0;
		
		StringBuffer buffer = new StringBuffer();
		
		char [] buf = new char[4096];//1024byte

		long startTime = System.currentTimeMillis();
		while((data = fin.read(buf)) != -1) 
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
