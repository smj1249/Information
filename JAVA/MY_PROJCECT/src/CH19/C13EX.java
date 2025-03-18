package CH19;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class C13EX {

	public static void main(String[] args) {
		// OPENWEATHER MAP API 를 이용해서 날씨 정보 받아옵니다
		// (https://openweathermap.org/api/one-call-3)
		String api_key = "cc97f87b2aee4dcd84c3c5b331e8fa04";
		String url = "https://api.openweathermap.org/data/2.5/weather";
		String lat = "44.34";
		String lon = "10.99";

		url = url + "?lat=" + lat + "&lon" + lon + "&exclude=" + exclude + "&appid=" + appid;

		// Http Request 객체 생성
		HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

		// Http Request 요청 / 응답 확인
		HttpClient httpClient = HttpClient.newHttpClient();

		HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
//				System.out.println(response.body());

		// 가공 처리 (Class Type vs JSON Type)
		ObjectMapper objectMapper = new ObjectMapper();

	}

	private static class Aaa {
		// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
		// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
		/*
		 * ObjectMapper om = new ObjectMapper(); Root root = om.readValue(myJsonString,
		 * Root.class);
		 */
		public class Clouds {
			public int all;
		}

		public class Coord {
			public double lon;
			public double lat;
		}

		public class Main {
			public double temp;
			public double feels_like;
			public double temp_min;
			public double temp_max;
			public int pressure;
			public int humidity;
			public int sea_level;
			public int grnd_level;
		}

		public class Rain {
			@JsonProperty("1h")
			public double _1h;
		}

		public class Root {
			public Coord coord;
			public ArrayList<Weather> weather;
			public String base;
			public Main main;
			public int visibility;
			public Wind wind;
			public Rain rain;
			public Clouds clouds;
			public int dt;
			public Sys sys;
			public int timezone;
			public int id;
			public String name;
			public int cod;
		}

		public class Sys {
			public int type;
			public int id;
			public String country;
			public int sunrise;
			public int sunset;
		}

		public class Weather {
			public int id;
			public String main;
			public String description;
			public String icon;
		}

		public class Wind {
			public double speed;
			public int deg;
			public double gust;
		}

	}
}