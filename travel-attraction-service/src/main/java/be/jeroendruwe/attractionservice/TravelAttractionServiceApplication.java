package be.jeroendruwe.attractionservice;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TravelAttractionServiceApplication {
	
	public static void main(String[] args) {
	    SpringApplication app = new SpringApplication(TravelAttractionServiceApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
	}
}
