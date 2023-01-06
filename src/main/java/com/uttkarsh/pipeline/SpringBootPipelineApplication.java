package com.uttkarsh.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication 
@RestController

public class SpringBootPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPipelineApplication.class, args);
	}
@GetMapping("/")
public String Home() {
	return "Welcome" ;
	
}

}
