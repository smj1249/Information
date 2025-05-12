package com.example.demo.C02OpenWeatherMap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;

@RestController
@Slf4j
@RequestMapping("/open/weather")
public class OpenWeatherController {
    //https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}
    @GetMapping("/get/{lat}/{lon}")
    public void get(@PathVariable String lat , @PathVariable String lon) throws UnsupportedEncodingException {
        log.info("GET /open/weather/get....");
        String url="https://api.openweathermap.org/data/2.5/weather";
//        String lat="";
//        String lon="";
        String serviceKey="2d8187fb662c9a0871d7a65d5941a3e8";
        URI uri = UriComponentsBuilder
                .fromHttpUrl(url)
                .queryParam("appid", URLEncoder.encode(serviceKey, "UTF-8")) // 인코딩 꼭 필요
                .queryParam("lat", lat)
                .queryParam("lon", lon)
                .build(true) // 자동 인코딩 방지 → true 설정 중요
                .toUri();

        //요청 헤더 x
        //요청 바디 x

        //요청 -> 응답
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> response = rt.exchange(uri, HttpMethod.GET,null,String.class);
        System.out.println(response);




    }
}
