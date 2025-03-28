package Ch19;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URL;

public class C09URLStreamMain {

	public static void main(String[] args) throws Exception {
		
		//URL url = new URL("https://n.news.naver.com/mnews/article/001/0014575456");
		URL url = (new URI("https://n.news.naver.com/mnews/article/008/0005165706")).toURL();
		InputStream in =  url.openStream();
		
		//보조 스트림 추가(Ch20에서 진행)
		BufferedInputStream buffIn = new BufferedInputStream(in);	//버퍼 공간 추가
		Reader rin = new InputStreamReader(buffIn);					// byte -> char 변환
		
		Writer out = new FileWriter("C:\\IOTEST\\index.html");
//		OutputStream out = new FileOutputStream("C:\\IOTEST\\index.html");
		
		while(true) {
			int data = rin.read();
			if(data==-1)
				break;
			System.out.print((char)(data));
			out.write((char)data);
			out.flush();
		}
		rin.close();
		buffIn.close();
		in.close();
		out.close();
		
	}

}
