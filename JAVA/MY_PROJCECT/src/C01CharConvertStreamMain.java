package CH20;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C01CharConvertStreamMain {

	public static void main(String[] args) throws Exception{	
		Writer out = new FileOutputStream("c:\\IOTEST\\test.txt");
		BufferedWriter bout = new OutputStreamWriter(out);
		PrintWriter pout = new BufferedWriter(bout);
		bout.flush();
		bout.close();
		
//		InputStream in = new FileInputStream("c:\\tmp_io\\test.txt");
//		BufferedInputStream bin =  new BufferedInputStream(in);
//		InputStreamReader rin = new InputStreamReader(bin);
//		while(true) {
//			int data = rin.read();
//			if(data==-1)
//				break;
//			System.out.print((char)data);
			
		}
		
		
	}
}