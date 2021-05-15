package ingjulianvega.ximic.msscasueureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsscAsuEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscAsuEurekaApplication.class, args);
	}

}
