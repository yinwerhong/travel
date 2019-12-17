package be.jeroendruwe.apigateway;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class TravelApiGatewayApplication {

	public static void main(String[] args) {
	    SpringApplication app = new SpringApplication(TravelApiGatewayApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
	}
}
