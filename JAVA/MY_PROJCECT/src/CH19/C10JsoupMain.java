package CH19;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.UUID;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class C10JsoupMain {

	public static void main(String[] args) throws IOException, URISyntaxException {

		// URL 연결
		Connection conn = Jsoup.connect("")
							.userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36")
							.timeout(5000)
							.ignoreHttpErrors(true)
							.followRedirects(true);
		// DOM객체 받기
		Document document = conn.get();
//		System.out.println(document);

		Elements elements = document.getElementsByTag("img");
		System.out.println(elements.size());

		
		
		for (Element el : elements) {
//			
			try {
				System.out.println(el);
				String img_url = el.getElementsByAttribute("src").attr("src");
//				System.out.println(img_url);

				URL url = (new URI(img_url)).toURL();
				InputStream in = url.openStream();
				BufferedInputStream buffIn = new BufferedInputStream(in); // 버퍼 공간 추가

				OutputStream out = null;

				if (img_url.contains(".png"))
					out = new FileOutputStream("C:\\IOTEST\\" + UUID.randomUUID() + ".png");
				else if (img_url.contains(".svg"))
					out = new FileOutputStream("C:\\IOTEST\\" + UUID.randomUUID() + ".svg");
				else if (img_url.contains(".webp"))
					out = new FileOutputStream("C:\\IOTEST\\" + UUID.randomUUID() + ".webp");
				else
					out = new FileOutputStream("C:\\IOTEST\\" + UUID.randomUUID() + ".jpg");

				while (true) {
					int data = buffIn.read();
					if (data == -1)
						break;
					out.write((byte) data);
					out.flush();
				}

				out.close();
				buffIn.close();
				in.close();
			} catch (Exception e) {

			} finally {
			
			}

		}

	}

}