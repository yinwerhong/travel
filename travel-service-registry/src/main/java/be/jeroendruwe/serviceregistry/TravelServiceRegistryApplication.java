package be.jeroendruwe.serviceregistry;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TravelServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(TravelServiceRegistryApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}