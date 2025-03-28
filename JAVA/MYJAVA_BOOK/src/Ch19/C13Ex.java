package Ch19;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class C13Ex {

	public static void main(String[] args) throws IOException, InterruptedException {
		// OPENWEATHER MAP API 를 이용해서 날씨 정보 받아옵니다 
		//(https://openweathermap.org/current)
		
		String api_key = "2d8187fb66-";
		String url = "https://api.openweathermap.org/data/2.5/weather?lat="+args[0]+"&lon="+args[1]+"&appid="+api_key;
		
		// Http Request 객체 생성
		HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

		// Http Request 요청 / 응답 확인
		HttpClient httpClient = HttpClient.newHttpClient();

		HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		
	}

}
