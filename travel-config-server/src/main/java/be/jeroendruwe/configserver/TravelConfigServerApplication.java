package be.jeroendruwe.configserver;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TravelConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(TravelConfigServerApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
    
}