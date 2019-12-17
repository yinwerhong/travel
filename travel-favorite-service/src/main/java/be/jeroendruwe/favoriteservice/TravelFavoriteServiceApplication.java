package be.jeroendruwe.favoriteservice;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TravelFavoriteServiceApplication {

	public static void main(String[] args) {
	    SpringApplication app = new SpringApplication(TravelFavoriteServiceApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
	}
}
