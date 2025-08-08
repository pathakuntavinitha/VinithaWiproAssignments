package eureka.EurekaServerAss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAssApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerAssApplication.class, args);
	}

}
