package Ch19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C06FileOutputStreamMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		OutputStream out = new FileOutputStream("C:\\IOTEST\\test4.txt");
		out.write("가나다".getBytes(StandardCharsets.UTF_8));
		out.write('a');
		out.write('b');
		out.write('c');
		out.flush();
		out.close();
	}

}
