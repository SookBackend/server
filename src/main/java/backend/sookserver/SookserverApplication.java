package backend.sookserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SookserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SookserverApplication.class, args);
		System.out.println("Hello!");
	}

}
