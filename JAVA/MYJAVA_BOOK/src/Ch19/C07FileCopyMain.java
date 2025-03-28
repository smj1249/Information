package Ch19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C07FileCopyMain {

	public static void main(String[] args) throws Exception{
	
		InputStream in = new FileInputStream("C:\\IOTEST\\data.zip");
		OutputStream out = new FileOutputStream("C:\\IOTEST\\COPY_data.zip");

		//01 버퍼미사용
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
//		System.out.println("진행완료 ! ");
		
		//02 버퍼사용
		System.out.println("진행중 - ");
		byte [] buff = new byte[4096];
		while(true) {
			int data = in.read(buff);
			if(data==-1)
				break;
//			out.write((byte)data);
			out.write(buff,0,data);
			out.flush();
		}
		in.close();
		out.close();
		System.out.println("진행완료 ! ");
		
	}

}
