package br.ufc.quixada.deployTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class DeployTestApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DeployTestApplication.class);
	}

	public static void main(String[] args) throws Exception{
		SpringApplication.run(DeployTestApplication.class, args);
	}
}
