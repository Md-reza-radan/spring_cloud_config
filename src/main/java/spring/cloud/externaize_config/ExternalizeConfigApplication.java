package spring.cloud.externaize_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ExternalizeConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExternalizeConfigApplication.class, args);
    }
}
