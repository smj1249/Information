package CH19;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;

public class C02ReaderMain {

	public static void main(String[] args) throws IOException {
		Reader fin = new FileReader("C:\\IoTest\\test1.txt");
		int data=0;
		String str="";
		StringBuffer buffer = new StringBuffer();
		while((data = fin.read()) != -1) {
			System.out.println((char)data);
			buffer.append((char)data);
		}
		System.out.println();
		System.out.println(buffer);
		
		fin.close();
	}

}
