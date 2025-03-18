package CH19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C07FileCopyMain {

	public static void main(String[] args) throws Exception { 
		
		InputStream in = new FileInputStream("C:\\IoTest\\07MQ");
		OutputStream out = new FileOutputStream("C:\\IoTest\\COPY_07MQ");
		
		// 01 버퍼 미사용
//		System.out.println("진행중 - ");
//		while(true) {
//			int data = in.read();
//			if(data==-1)
//				break;
//			out.write((byte)data);
//			out.flush();
//		}
//		in.close();
//		out.close();
		
		// 02 버퍼 사용
		System.out.println("진행중 - ");
		byte [] buff = new byte[4096];
		while(true) {
			int data = in.read(buff);
			if(data==-1)
				break;
//			out.write((byte)data);
			out.write(buff, 0, data);
			out.flush();
		}
		in.close();
		out.close();
	}

}
