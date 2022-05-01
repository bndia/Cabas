package com.bendiamand.cabas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class CabasApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CabasApplication.class, args);

		String os = System.getProperty("os.name", "generic");
		if (os.toLowerCase().contains("win")) {
			Runtime rt = Runtime.getRuntime();
			String url = "http://localhost:8080/";
			rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
		}
		if (os.toLowerCase().contains("mac")) {
			Runtime rt = Runtime.getRuntime();
			String url = "http://localhost:8080/";
			rt.exec("open " + url);
		}
	}


}

