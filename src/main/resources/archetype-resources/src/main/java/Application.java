package $springboot.architype.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import dsalgo.learning.io.Application;

@SpringBootApplication
@ComponentScan(value = "$springboot.architype.io")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
