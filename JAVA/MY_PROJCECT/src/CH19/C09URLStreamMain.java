package CH19;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URL;

public class C09URLStreamMain {

	public static void main(String[] args)throws Exception {
//		URL url = new URL("https://m.sports.naver.com/wfootball/article/076/0004254117")
		URL url = (new URI("https://m.sports.naver.com/wfootball/article/076/0004254117")).toURL();
		InputStream in = url.openStream();
		
		// 보조 스트림 추가(Ch20에서 진행)
		BufferedInputStream buffIn = new BufferedInputStream(in);	// 버퍼 공간 추가
		Reader rin = new InputStreamReader(buffIn);					// byte -> char 변환
		
		Writer out = new FileWriter("C:\\IoTest\\index.html");
//		OutputStream out = new FileOutputStream("C:\\IoTest\\index.html");
		
		while(true) {
			int data = rin.read();
			if(data==-1)
				break;
			System.out.println((char)data);
			out.write((char)data);
			out.flush();
		}
		rin.close();
		buffIn.close();
		in.close();
		out.close();


	}

}
